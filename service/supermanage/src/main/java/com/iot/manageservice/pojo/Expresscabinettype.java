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
@ApiModel(value="Expresscabinettype对象", description="")
public class Expresscabinettype implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "快递柜类型ID")
    @TableId(value = "ExpressCabintTypeID", type = IdType.AUTO)
    private Integer ExpressCabintTypeID;

    @ApiModelProperty(value = "柜机类型ID")
    @TableField("CabintTypeID")
    private Integer CabintTypeID;

    @ApiModelProperty(value = "简称")
    @TableField("ShortName")
    private String ShortName;

    @ApiModelProperty(value = "全称")
    @TableField("LongName")
    private String LongName;

    @ApiModelProperty(value = "快递柜宽")
    @TableField("Width")
    private Double Width;

    @ApiModelProperty(value = "快递柜高")
    @TableField("Height")
    private Double Height;

    @ApiModelProperty(value = "快递柜深")
    @TableField("Depth")
    private Double Depth;

    @ApiModelProperty(value = "备注")
    @TableField("Remark")
    private String Remark;

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
