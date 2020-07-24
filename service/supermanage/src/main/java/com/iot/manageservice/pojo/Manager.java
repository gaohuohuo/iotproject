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
@ApiModel(value="Manager对象", description="")
public class Manager implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "管理人员ID")
    @TableId(value = "ManagerID", type = IdType.AUTO)
    private Integer ManagerID;

    @ApiModelProperty(value = "客户ID")
    @TableField("CustomerID")
    private Integer CustomerID;

    @ApiModelProperty(value = "管理员号码")
    @TableField("Phone")
    private String Phone;

    @ApiModelProperty(value = "管理员姓名")
    @TableField("Name")
    private String Name;

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
    private Boolean Del;


}
