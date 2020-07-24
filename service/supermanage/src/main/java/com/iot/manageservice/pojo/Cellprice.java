package com.iot.manageservice.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author GaoHuoHuo
 * @since 2020-07-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Cellprice对象", description="")
public class Cellprice implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "快递柜格口价格ID")
    @TableId(value = "CellPriceID", type = IdType.AUTO)
    private Integer CellPriceID;

    @ApiModelProperty(value = "客户ID")
    @TableField("CustomerID")
    private Integer CustomerID;

    @ApiModelProperty(value = "快递柜格口类型ID")
    @TableField("CellTypeID")
    private Integer CellTypeID;

    @ApiModelProperty(value = "正常价格")
    @TableField("NormalPrice")
    private BigDecimal NormalPrice;

    @ApiModelProperty(value = "滞纳金")
    @TableField("LatePrice")
    private BigDecimal LatePrice;

    @ApiModelProperty(value = "最高滞纳金")
    @TableField("LateFeeMax")
    private BigDecimal LateFeeMax;

    @ApiModelProperty(value = "创建时间")
    @TableField("CreateTime")
    private Date CreateTime;

    @ApiModelProperty(value = "修改时间")
    @TableField("Updatetime")
    private Date Updatetime;

    @ApiModelProperty(value = "逻辑删除")
    @TableField("Del")
    private Integer Del;


}
