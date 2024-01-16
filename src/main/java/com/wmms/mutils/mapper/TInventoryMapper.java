package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TInventory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TInventoryMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(TInventory record);

    int insertSelective(TInventory record);

    TInventory selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(TInventory record);

    int updateByPrimaryKey(TInventory record);
}