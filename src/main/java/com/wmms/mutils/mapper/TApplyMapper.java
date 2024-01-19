package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TApply;
import com.wmms.mutils.entity.TApplyExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TApplyMapper {
    long countByExample(TApplyExample example);

    int deleteByExample(TApplyExample example);

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
    int insert(TApply record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TApply record);

    List<TApply> selectByExample(TApplyExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TApply selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TApply record, @Param("example") TApplyExample example);

    int updateByExample(@Param("record") TApply record, @Param("example") TApplyExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TApply record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TApply record);
}