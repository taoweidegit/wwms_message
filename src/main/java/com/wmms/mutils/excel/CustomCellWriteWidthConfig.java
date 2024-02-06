package com.wmms.mutils.excel;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.data.CellData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.style.column.AbstractColumnWidthStyleStrategy;
import org.apache.commons.collections.CollectionUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomCellWriteWidthConfig extends AbstractColumnWidthStyleStrategy
{
    private final Map<Integer, Map<Integer, Integer>> CACHE = new HashMap<>();

    @Override
    protected void setColumnWidth(WriteSheetHolder writeSheetHolder, List<WriteCellData<?>> cellDataList, Cell cell, Head head, Integer integer, Boolean isHead)
    {
        boolean needSetWidth = isHead || !CollectionUtils.isEmpty(cellDataList);
        if (needSetWidth)
        {
            Map<Integer, Integer> maxColumnWidthMap = CACHE.computeIfAbsent(writeSheetHolder.getSheetNo(), k -> new HashMap<>());

            Integer columnWidth = this.dataLength(cellDataList, cell, isHead);
            // 单元格文本长度大于60换行
            if (columnWidth >= 0)
            {
                if (columnWidth > 60)
                    columnWidth = 60;
                Integer maxColumnWidth = maxColumnWidthMap.get(cell.getColumnIndex());
                if (maxColumnWidth == null || columnWidth > maxColumnWidth)
                {
                    maxColumnWidthMap.put(cell.getColumnIndex(), columnWidth);
                    Sheet sheet = writeSheetHolder.getSheet();
                    sheet.setColumnWidth(cell.getColumnIndex(), columnWidth * 256);
                }
            }
        }
    }

    private Integer dataLength(List<WriteCellData<?>> cellDataList, Cell cell, Boolean isHead)
    {
        if (isHead)
            return cell.getStringCellValue().getBytes().length;
        else
        {
            CellData<?> cellData = cellDataList.get(0);
            CellDataTypeEnum type = cellData.getType();
            if (type == null)
                return -1;
            else
            {
                return switch (type) {
                    case STRING -> {
                        int index = cellData.getStringValue().indexOf("\n");
                        yield index != -1 ?
                                cellData.getStringValue().substring(0, index).getBytes().length + 1 : cellData.getStringValue().getBytes().length + 1;
                        // 换行符（数据需要提前解析好）
                    }
                    case BOOLEAN -> cellData.getBooleanValue().toString().getBytes().length;
                    case NUMBER -> cellData.getNumberValue().toString().getBytes().length;
                    default -> -1;
                };
            }
        }
    }
}
