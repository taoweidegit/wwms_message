package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TWarehouseAdministrator;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TWarehouseAdministratorMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(TWarehouseAdministrator record);

    int insertSelective(TWarehouseAdministrator record);

    TWarehouseAdministrator selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(TWarehouseAdministrator record);

    int updateByPrimaryKey(TWarehouseAdministrator record);
}