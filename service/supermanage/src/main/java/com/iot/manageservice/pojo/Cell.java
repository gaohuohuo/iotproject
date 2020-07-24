package com.iot.manageservice.pojo;

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
@ApiModel(value="Cell对象", description="")
public class Cell implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "快递柜格口ID")
    @TableId(value = "CellID", type = IdType.AUTO)
    private Integer CellID;

    @ApiModelProperty(value = "快递柜格口类型ID")
    @TableField("CellTypeID")
    private Integer CellTypeID;

    @ApiModelProperty(value = "自提柜ID")
    @TableField("CabinetID")
    private Integer CabinetID;

    @ApiModelProperty(value = "快递柜列")
    @TableField("Column")
    private Integer Column;

    @ApiModelProperty(value = "快递柜行")
    @TableField("Row")
    private Integer Row;

    @ApiModelProperty(value = "能否存包裹")
    @TableField("CanSavePackage")
    private Integer CanSavePackage;

    @ApiModelProperty(value = "格口门状态")
    @TableField("DoorStatus")
    private Integer DoorStatus;

    @ApiModelProperty(value = "保持时间")
    @TableField("HoldTime")
    private Date HoldTime;

    @ApiModelProperty(value = "开始时间")
    @TableField("StartTime")
    private Date StartTime;

    @ApiModelProperty(value = "用户号码")
    @TableField("UserPhone")
    private String UserPhone;

    @ApiModelProperty(value = "创建时间")
    @TableField("CreateTime")
    private Date CreateTime;

    @ApiModelProperty(value = "修改时间")
    @TableField("UpdateTime")
    private Date UpdateTime;

    @ApiModelProperty(value = "逻辑删除")
    @TableField("Del")
    private Integer Del;


}
