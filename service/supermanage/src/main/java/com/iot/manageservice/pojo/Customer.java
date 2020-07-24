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
@ApiModel(value="Customer对象", description="")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "客户ID")
    @TableId(value = "CustomerID", type = IdType.AUTO)
    private Integer CustomerID;

    @ApiModelProperty(value = "客户手机号码")
    @TableField("Phone")
    private String Phone;

    @ApiModelProperty(value = "客户姓名")
    @TableField("Name")
    private String Name;

    @ApiModelProperty(value = "客户地址")
    @TableField("Address")
    private String Address;

    @ApiModelProperty(value = "备注")
    @TableField("Remark")
    private String Remark;

    @ApiModelProperty(value = "上级ID")
    @TableField("ParentID")
    private Integer ParentID;

    @ApiModelProperty(value = "创建时间")
    @TableField("CreateTime")
    private Date CreateTime;

    @ApiModelProperty(value = "最后修改时间")
    @TableField("UpdateTime")
    private Date UpdateTime;

    @ApiModelProperty(value = "逻辑删除")
    @TableField("Del")
    private Boolean Del;


}
