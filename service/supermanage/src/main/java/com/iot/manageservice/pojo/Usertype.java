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
@ApiModel(value="Usertype对象", description="")
public class Usertype implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户类型ID")
    @TableId(value = "UserTpyeID", type = IdType.AUTO)
    private Integer UserTpyeID;

    @ApiModelProperty(value = "类型名称")
    @TableField("Name")
    private String Name;

    @ApiModelProperty(value = "创建时间")
    @TableField("CreateTime")
    private Date CreateTime;

    @ApiModelProperty(value = "逻辑删除")
    @TableField("Del")
    private Boolean Del;


}
