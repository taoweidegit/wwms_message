package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TLogin;
import com.wmms.mutils.entity.TLoginExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TLoginMapper {
    long countByExample(TLoginExample example);

    int deleteByExample(TLoginExample example);

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
    int insert(TLogin record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TLogin record);

    List<TLogin> selectByExample(TLoginExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TLogin selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TLogin record, @Param("example") TLoginExample example);

    int updateByExample(@Param("record") TLogin record, @Param("example") TLoginExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TLogin record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TLogin record);

    int updateByUidAndDevice(TLogin tLogin);
}