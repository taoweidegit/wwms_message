package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TDepartment;
import com.wmms.mutils.entity.TDepartmentExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TDepartmentMapper {
    long countByExample(TDepartmentExample example);

    int deleteByExample(TDepartmentExample example);

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
    int insert(TDepartment record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TDepartment record);

    List<TDepartment> selectByExample(TDepartmentExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TDepartment selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TDepartment record, @Param("example") TDepartmentExample example);

    int updateByExample(@Param("record") TDepartment record, @Param("example") TDepartmentExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TDepartment record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TDepartment record);
}