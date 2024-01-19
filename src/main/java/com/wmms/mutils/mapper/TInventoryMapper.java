package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TInventory;
import com.wmms.mutils.entity.TInventoryExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TInventoryMapper {
    long countByExample(TInventoryExample example);

    int deleteByExample(TInventoryExample example);

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
    int insert(TInventory record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TInventory record);

    List<TInventory> selectByExample(TInventoryExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TInventory selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TInventory record, @Param("example") TInventoryExample example);

    int updateByExample(@Param("record") TInventory record, @Param("example") TInventoryExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TInventory record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TInventory record);
}