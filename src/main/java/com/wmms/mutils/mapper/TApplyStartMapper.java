package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TApplyStart;
import com.wmms.mutils.entity.TApplyStartExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TApplyStartMapper {
    long countByExample(TApplyStartExample example);

    int deleteByExample(TApplyStartExample example);

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
    int insert(TApplyStart record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TApplyStart record);

    List<TApplyStart> selectByExample(TApplyStartExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TApplyStart selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TApplyStart record, @Param("example") TApplyStartExample example);

    int updateByExample(@Param("record") TApplyStart record, @Param("example") TApplyStartExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TApplyStart record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TApplyStart record);
}