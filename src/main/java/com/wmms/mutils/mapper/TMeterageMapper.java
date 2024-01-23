package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TMeterage;
import com.wmms.mutils.entity.TMeterageExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TMeterageMapper {
    long countByExample(TMeterageExample example);

    int deleteByExample(TMeterageExample example);

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
    int insert(TMeterage record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TMeterage record);

    List<TMeterage> selectByExample(TMeterageExample example);

    /**
     * select by primary key
     * @param ID primary key
     * @return object by primary key
     */
    TMeterage selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TMeterage record, @Param("example") TMeterageExample example);

    int updateByExample(@Param("record") TMeterage record, @Param("example") TMeterageExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TMeterage record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TMeterage record);
}