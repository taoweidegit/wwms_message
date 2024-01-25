package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TModel;
import com.wmms.mutils.entity.TModelExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TModelMapper {
    long countByExample(TModelExample example);

    int deleteByExample(TModelExample example);

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
    int insert(TModel record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TModel record);

    List<TModel> selectByExample(TModelExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TModel selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TModel record, @Param("example") TModelExample example);

    int updateByExample(@Param("record") TModel record, @Param("example") TModelExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TModel record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TModel record);
}