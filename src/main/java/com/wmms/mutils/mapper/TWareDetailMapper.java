package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TWareDetail;
import com.wmms.mutils.entity.TWareDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TWareDetailMapper {
    long countByExample(TWareDetailExample example);

    int deleteByExample(TWareDetailExample example);

    /**
     * delete by primary key
     * @param ID primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long ID);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TWareDetail record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TWareDetail record);

    List<TWareDetail> selectByExample(TWareDetailExample example);

    /**
     * select by primary key
     * @param ID primary key
     * @return object by primary key
     */
    TWareDetail selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TWareDetail record, @Param("example") TWareDetailExample example);

    int updateByExample(@Param("record") TWareDetail record, @Param("example") TWareDetailExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TWareDetail record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TWareDetail record);
}