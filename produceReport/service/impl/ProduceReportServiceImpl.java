package com.qhit.produceReport.service.impl;

import com.qhit.baseDevice.pojo.BaseDevice;
import com.qhit.baseDevtype.pojo.BaseDevtype;
import com.qhit.baseFlow.pojo.BaseFlow;
import com.qhit.produceReport.service.IProduceReportService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qhit.produceReport.dao.IProduceReportDao;
import com.qhit.produceReport.pojo.ProduceReport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* Created by GeneratorCode on 2019/04/08
*/

@Service 
public class ProduceReportServiceImpl  implements IProduceReportService {

    @Resource 
    IProduceReportDao dao;

    @Override 
    public boolean insert(Object object) { 
        return dao.insert(object); 
    } 

    @Override 
    public boolean update(Object object) { 
        return dao.update(object); 
    } 

    @Override
    @Transactional
    public boolean updateSelective(Object object) { 
        return dao.updateSelective(object); 
    } 

    @Override 
    public boolean delete(Object id) { 
        ProduceReport produceReport = findById(id); 
        return dao.delete(produceReport); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public ProduceReport findById(Object id) { 
        List<ProduceReport> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<ProduceReport> search(ProduceReport produceReport) { 
        return dao.search(produceReport); 
    }

    @Override
    public List<Map> selectFlowAmount(String year, List<BaseFlow> flows) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("flows",flows);
        return dao.selectFlowAmount(map);
    }

    @Override
    public List<Map> selectDevTypeAmount(String year, List<BaseDevtype> devTypeList) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devTypeList",devTypeList);
        return dao.selectDevTypeAmount(map);
    }

    @Override
    public List<Map> selectDevAmount(String year, List<BaseDevice> devices) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devices",devices);
        return dao.selectDevAmount(map);
    }

    @Override
    public List<Map> selectDevConsume(String year, List<BaseDevice> devices) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devices",devices);
        return dao.selectDevConsume(map);
    }

    @Override
    public List<Map> selectDevTypeConsume(String year, List<BaseDevtype> devTypeList) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devTypeList",devTypeList);
        return dao.selectDevTypeConsume(map);
    }

    @Override
    public List<Map> selectFlowConsume(String year, List<BaseFlow> flows) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("flows",flows);
        return dao.selectFlowConsume(map);
    }

    @Override
    public List<Map> selectElectricConsume(String year, List<BaseDevice> devices) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devices",devices);
        return dao.selectElectricConsume(map);
    }

    @Override
    public List<Map> selectWaterConsume(String year, List<BaseDevice> devices) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devices",devices);
        return dao.selectWaterConsume(map);
    }

    @Override
    public List<Map> selectOilConsume(String year, List<BaseDevice> devices) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devices",devices);
        return dao.selectOilConsume(map);
    }

}