package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TWareKind;
import com.wmms.mutils.entity.TWareKindExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TWareKindMapper {
    long countByExample(TWareKindExample example);

    int deleteByExample(TWareKindExample example);

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
    int insert(TWareKind record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TWareKind record);

    List<TWareKind> selectByExample(TWareKindExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TWareKind selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TWareKind record, @Param("example") TWareKindExample example);

    int updateByExample(@Param("record") TWareKind record, @Param("example") TWareKindExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TWareKind record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TWareKind record);
}