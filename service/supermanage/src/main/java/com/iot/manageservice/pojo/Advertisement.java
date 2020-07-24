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
@ApiModel(value="Advertisement对象", description="")
public class Advertisement implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "广告ID")
    @TableId(value = "AdvertisementID", type = IdType.AUTO)
    private Integer AdvertisementID;

    @ApiModelProperty(value = "客户ID")
    @TableField("CustomerID")
    private Integer CustomerID;

    @ApiModelProperty(value = "广告类型")
    @TableField("AdType")
    private Integer AdType;

    @ApiModelProperty(value = "广告名称")
    @TableField("Name")
    private String Name;

    @ApiModelProperty(value = "广告路径")
    @TableField("Path")
    private String Path;

    @ApiModelProperty(value = "上传时间")
    @TableField("UploadTime")
    private Date UploadTime;

    @ApiModelProperty(value = "备注")
    @TableField("Remark")
    private String Remark;

    @ApiModelProperty(value = "是否可用")
    @TableField("Iseable")
    private Integer Iseable;

    @ApiModelProperty(value = "修改时间")
    @TableField("UpdateTime")
    private Date UpdateTime;

    @ApiModelProperty(value = "逻辑删除")
    @TableField("Del")
    private Integer Del;


}
