package com.qhit.produceReport.controller; 

import com.qhit.baseFlow.pojo.BaseFlow;
import com.qhit.baseFlow.service.IBaseFlowService;
import com.qhit.energyConsume.service.IEnergyConsumeService;
import com.qhit.produceJob.service.IProduceJobService;
import com.qhit.produceReport.pojo.ProduceReport;
import com.qhit.produceReport.service.IProduceReportService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 

/** 
* Created by GeneratorCode on 2019/04/08
*/ 

@RestController 
@RequestMapping("/produceReport") 
public class ProduceReportController { 

    @Resource 
    IProduceReportService produceReportService;
    @Resource
    IBaseFlowService baseFlowService;
    @Resource
    IProduceJobService produceJobService;
    @Resource
    IEnergyConsumeService energyConsumeService;

    @RequestMapping("/insert") 
    public void insert(ProduceReport produceReport) { 
        produceReportService.insert(produceReport); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer reportid) { 
        produceReportService.delete(reportid); 
    } 

    @RequestMapping("/update") 
    public void update(ProduceReport produceReport) { 
        produceReportService.update(produceReport); 
    } 

    @RequestMapping("/updateSelective") 
    public List<ProduceReport> updateSelective(ProduceReport produceReport) {
        produceReportService.updateSelective(produceReport);
        return list();
    } 

    @RequestMapping("/load") 
    public ProduceReport load(Integer reportid) { 
        ProduceReport produceReport = produceReportService.findById(reportid); 
        return produceReport; 
    } 

    @RequestMapping("/list") 
    public List<ProduceReport> list()  { 
        List<ProduceReport> list = produceReportService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<ProduceReport> search(ProduceReport produceReport) { 
        List<ProduceReport> list = produceReportService.search(produceReport); 
        return list; 
    }

    @RequestMapping(value = "/completeTask")
    @Transactional
    public List<ProduceReport> completeTask(ProduceReport produceReport){
//        开发compoleteTask方法  接收参数：reportid,flowid,startjobtime,completetime
//        将获取的参数赋值给produceReport1对象
//        获取对应流程的设备
//        try{
//            int i=1/0;
//        }catch (Exception e){
//            throw new RuntimeException();
//        }
        BaseFlow baseFlow = baseFlowService.findById(produceReport.getFlowid());
//        更改数据
        produceReportService.updateSelective(produceReport);
        produceJobService.insert(produceReport,baseFlow);
        energyConsumeService.insert(produceReport,baseFlow);
        return list();
    }
} 
