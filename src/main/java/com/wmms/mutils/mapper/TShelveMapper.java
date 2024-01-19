package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TShelve;
import com.wmms.mutils.entity.TShelveExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TShelveMapper {
    long countByExample(TShelveExample example);

    int deleteByExample(TShelveExample example);

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
    int insert(TShelve record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TShelve record);

    List<TShelve> selectByExample(TShelveExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TShelve selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TShelve record, @Param("example") TShelveExample example);

    int updateByExample(@Param("record") TShelve record, @Param("example") TShelveExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TShelve record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TShelve record);
}