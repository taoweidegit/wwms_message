package com.wmms.mutils.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class ApplyPlanExcelData
{
    @ExcelProperty("申请人")
    private String name;
    @ExcelProperty("备件类别")
    private String type;
    @ExcelProperty("料号")
    private String itemNumber;
    @ExcelProperty("备件类型")
    private String model;
    @ExcelProperty("申请数量")
    private String applyCount;
}
