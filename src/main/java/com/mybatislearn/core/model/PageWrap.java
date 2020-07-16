package com.mybatislearn.core.model;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页请求参数
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
@Data
@ApiModel("分页对象")
public class PageWrap<M> {

    @ApiModelProperty("条件参数")
    private M model;

    @ApiModelProperty("目标页")
    private int page;

    @ApiModelProperty("一页多少行")
    private int capacity;

    @ApiModelProperty("排序参数")
    private List<SortData> sorts;

    /**
     * 获取排序字符串
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    public String getOrderByClause () {
        if (this.getSorts() == null || this.getSorts().size() == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (SortData sortData: sorts) {
            stringBuilder.append(sortData.getProperty());
            stringBuilder.append(" ");
            stringBuilder.append(sortData.getDirection());
            stringBuilder.append(",");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }

    /**
     * 排序对象
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    @Data
    @ApiModel("排序对象")
    public static class SortData {

        @ApiModelProperty("排序字段")
        private String property;

        @ApiModelProperty("排序方向（ASC：升序，DESC：降序）")
        private String direction;
    }
}
