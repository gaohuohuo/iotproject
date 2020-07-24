package com.iot.manageservice.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value="Address对象", description="")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "地址ID")
    @TableId(value = "AddressID", type = IdType.AUTO)
    private Integer AddressID;

    @ApiModelProperty(value = "省ID")
    @TableField("ProvinceID")
    private Integer ProvinceID;

    @ApiModelProperty(value = "市ID")
    @TableField("CityID")
    private Integer CityID;

    @ApiModelProperty(value = "县ID")
    @TableField("TownID")
    private Integer TownID;

    @ApiModelProperty(value = "地区ID")
    @TableField("DistrictID")
    private Integer DistrictID;

    @ApiModelProperty(value = "地址详情")
    @TableField("AddressDetail")
    private String AddressDetail;


}
