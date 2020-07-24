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
@ApiModel(value="Loginlog对象", description="")
public class Loginlog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "登录日志ID")
    @TableId(value = "LoginLogID", type = IdType.AUTO)
    private Integer LoginLogID;

    @ApiModelProperty(value = "登录用户")
    @TableField("Phone")
    private String Phone;

    @ApiModelProperty(value = "登录令牌")
    @TableField("TokenBase")
    private String TokenBase;

    @ApiModelProperty(value = "登录时间")
    @TableField("LoginTime")
    private Date LoginTime;

    @ApiModelProperty(value = "登录类型")
    @TableField("LoginType")
    private Integer LoginType;

    @ApiModelProperty(value = "失效时间")
    @TableField("ExpireTime")
    private Date ExpireTime;


}
