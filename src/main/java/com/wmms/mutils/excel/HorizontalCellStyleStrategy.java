package com.wmms.mutils.excel;

import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.util.ListUtils;
import com.alibaba.excel.write.handler.context.CellWriteHandlerContext;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.style.AbstractCellStyleStrategy;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class HorizontalCellStyleStrategy extends AbstractCellStyleStrategy
{
    private WriteCellStyle headWriteCellStyle;
    private List<WriteCellStyle> contentWriteCellStyleList;

    public HorizontalCellStyleStrategy(WriteCellStyle headWriteCellStyle, List<WriteCellStyle> contentWriteCellStyleList)
    {
        this.headWriteCellStyle = headWriteCellStyle;
        this.contentWriteCellStyleList = contentWriteCellStyleList;
    }

    public HorizontalCellStyleStrategy(WriteCellStyle headWriteCellStyle, WriteCellStyle contentWriteCellStyle)
    {
        this.headWriteCellStyle = headWriteCellStyle;
        if (contentWriteCellStyle != null)
            this.contentWriteCellStyleList = ListUtils.newArrayList(contentWriteCellStyle);
    }

    @Override
    protected void setHeadCellStyle(CellWriteHandlerContext context)
    {
        if (stopProcessing(context) || headWriteCellStyle == null)
            return;
        WriteCellData<?> cellData = context.getFirstCellData();
        WriteCellStyle.merge(headWriteCellStyle, cellData.getOrCreateStyle());
    }

    @Override
    protected void setContentCellStyle(CellWriteHandlerContext context)
    {
        if (stopProcessing(context) || CollectionUtils.isEmpty(contentWriteCellStyleList))
            return;
        WriteCellData<?> cellData = context.getFirstCellData();
        if (context.getRelativeRowIndex() == null || context.getRelativeRowIndex() <= 0)
            WriteCellStyle.merge(contentWriteCellStyleList.get(0), cellData.getOrCreateStyle());
        else
            WriteCellStyle.merge(
                    contentWriteCellStyleList.get(context.getRelativeRowIndex() % contentWriteCellStyleList.size()),
                    cellData.getOrCreateStyle());
    }

    protected boolean stopProcessing(CellWriteHandlerContext context)
    {
        return context.getFirstCellData() == null;
    }
}
