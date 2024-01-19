package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TWarehouse;
import com.wmms.mutils.entity.TWarehouseExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TWarehouseMapper {
    long countByExample(TWarehouseExample example);

    int deleteByExample(TWarehouseExample example);

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
    int insert(TWarehouse record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TWarehouse record);

    List<TWarehouse> selectByExample(TWarehouseExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TWarehouse selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TWarehouse record, @Param("example") TWarehouseExample example);

    int updateByExample(@Param("record") TWarehouse record, @Param("example") TWarehouseExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TWarehouse record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TWarehouse record);
}