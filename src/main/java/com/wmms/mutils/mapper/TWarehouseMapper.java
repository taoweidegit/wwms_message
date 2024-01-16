package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TWarehouse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TWarehouseMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(TWarehouse record);

    int insertSelective(TWarehouse record);

    TWarehouse selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(TWarehouse record);

    int updateByPrimaryKey(TWarehouse record);
}