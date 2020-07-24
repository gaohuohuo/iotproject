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
@ApiModel(value="Cabinet对象", description="")
public class Cabinet implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "柜机ID")
    @TableId(value = "CabintID", type = IdType.AUTO)
    private Integer CabintID;

    @ApiModelProperty(value = "柜机类型ID")
    @TableField("CabintTypeID")
    private Integer CabintTypeID;

    @ApiModelProperty(value = "柜机名称")
    @TableField("Name")
    private String Name;

    @ApiModelProperty(value = "柜机位置纬度")
    @TableField("Latitude")
    private Double Latitude;

    @ApiModelProperty(value = "柜机位置经度")
    @TableField("Longitude")
    private Double Longitude;

    @ApiModelProperty(value = "客户ID")
    @TableField("CustomerID")
    private Integer CustomerID;

    @ApiModelProperty(value = "地址ID")
    @TableField("AddressID")
    private Integer AddressID;

    @ApiModelProperty(value = "是否在线")
    @TableField("OnLine")
    private Boolean OnLine;

    @ApiModelProperty(value = "能否投件")
    @TableField("CanCourierPush")
    private Boolean CanCourierPush;

    @ApiModelProperty(value = "能否存件")
    @TableField("CanUserStore")
    private Boolean CanUserStore;

    @ApiModelProperty(value = "能否寄件")
    @TableField("CanUserPush")
    private Boolean CanUserPush;

    @ApiModelProperty(value = "创建时间")
    @TableField("CreateTime")
    private Date CreateTime;

    @ApiModelProperty(value = "修改时间")
    @TableField("UpdateTime")
    private Date UpdateTime;

    @ApiModelProperty(value = "逻辑删除")
    @TableField("Del")
    private Boolean Del;


}
