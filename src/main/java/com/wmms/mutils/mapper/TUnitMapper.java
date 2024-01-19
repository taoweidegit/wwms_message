package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TUnit;
import com.wmms.mutils.entity.TUnitExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TUnitMapper {
    long countByExample(TUnitExample example);

    int deleteByExample(TUnitExample example);

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
    int insert(TUnit record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TUnit record);

    List<TUnit> selectByExample(TUnitExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TUnit selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TUnit record, @Param("example") TUnitExample example);

    int updateByExample(@Param("record") TUnit record, @Param("example") TUnitExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TUnit record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TUnit record);
}