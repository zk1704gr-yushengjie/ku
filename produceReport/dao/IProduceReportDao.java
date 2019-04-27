package com.qhit.produceReport.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.produceReport.pojo.ProduceReport;
import java.util.List;
import java.util.Map;

/** 
* Created by GeneratorCode on 2019/04/08
*/

@Mapper  
public interface IProduceReportDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<ProduceReport> search(ProduceReport produceReport);

    List findByShipname(Object shipname);

    List findByCapacity(Object capacity);

    List findByPlanjobtime(Object planjobtime);

    List findByStartjobtime(Object startjobtime);

    List findByCompletetime(Object completetime);

    List findByFlowid(Object flowid);

    List findByReportuser(Object reportuser);

    List findByCompid(Object compid);

    List<Map> selectFlowAmount(Map map);

    List<Map> selectDevTypeAmount(Map map);

    List<Map> selectDevAmount(Map map);

    List<Map> selectDevConsume(Map map);

    List<Map> selectDevTypeConsume(Map map);

    List<Map> selectFlowConsume(Map map);

    List<Map> selectElectricConsume(Map map);

    List<Map> selectWaterConsume(Map map);

    List<Map> selectOilConsume(Map map);
}