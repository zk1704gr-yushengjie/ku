package com.qhit.produceReport.service;

import java.util.List;
import java.util.Map;

import com.qhit.baseDevice.pojo.BaseDevice;
import com.qhit.baseDevtype.pojo.BaseDevtype;
import com.qhit.baseFlow.pojo.BaseFlow;
import com.qhit.produceReport.pojo.ProduceReport;
/**
* Created by GeneratorCode on 2019/04/08
*/
public interface IProduceReportService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    ProduceReport findById(Object id);

    List<ProduceReport> search(ProduceReport produceReport);

    List<Map> selectFlowAmount(String year, List<BaseFlow> flows);

    List<Map> selectDevTypeAmount(String year, List<BaseDevtype> devTypeList);

    List<Map> selectDevAmount(String year, List<BaseDevice> devices);

    List<Map> selectDevConsume(String year, List<BaseDevice> devices);

    List<Map> selectDevTypeConsume(String year, List<BaseDevtype> devTypeList);

    List<Map> selectFlowConsume(String year, List<BaseFlow> flows);

    List<Map> selectElectricConsume(String year, List<BaseDevice> devices);

    List<Map> selectWaterConsume(String year, List<BaseDevice> devices);

    List<Map> selectOilConsume(String year, List<BaseDevice> devices);
}