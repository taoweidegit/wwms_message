package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TWare;
import com.wmms.mutils.entity.TWareExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TWareMapper {
    long countByExample(TWareExample example);

    int deleteByExample(TWareExample example);

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
    int insert(TWare record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TWare record);

    List<TWare> selectByExample(TWareExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TWare selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TWare record, @Param("example") TWareExample example);

    int updateByExample(@Param("record") TWare record, @Param("example") TWareExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TWare record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TWare record);
}