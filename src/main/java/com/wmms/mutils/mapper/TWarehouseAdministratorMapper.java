package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TWarehouseAdministrator;
import com.wmms.mutils.entity.TWarehouseAdministratorExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TWarehouseAdministratorMapper {
    long countByExample(TWarehouseAdministratorExample example);

    int deleteByExample(TWarehouseAdministratorExample example);

    /**
     * delete by primary key
     *
     * @param ID primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long ID);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(TWarehouseAdministrator record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TWarehouseAdministrator record);

    List<TWarehouseAdministrator> selectByExample(TWarehouseAdministratorExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TWarehouseAdministrator selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TWarehouseAdministrator record, @Param("example") TWarehouseAdministratorExample example);

    int updateByExample(@Param("record") TWarehouseAdministrator record, @Param("example") TWarehouseAdministratorExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TWarehouseAdministrator record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TWarehouseAdministrator record);
}