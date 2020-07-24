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
@ApiModel(value="Workorder对象", description="")
public class Workorder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "工单ID")
    @TableId(value = "WorkOrderID", type = IdType.AUTO)
    private Integer WorkOrderID;

    @ApiModelProperty(value = "工程人员ID")
    @TableField("EngineerID")
    private Integer EngineerID;

    @ApiModelProperty(value = "创建时间")
    @TableField("CreateTime")
    private Date CreateTime;

    @ApiModelProperty(value = "截止时间")
    @TableField("DeadLine")
    private Date DeadLine;

    @ApiModelProperty(value = "工单状态")
    @TableField("Status")
    private Integer Status;

    @ApiModelProperty(value = "安装地址")
    @TableField("Address")
    private String Address;

    @ApiModelProperty(value = "备注")
    @TableField("Remark")
    private String Remark;

    @ApiModelProperty(value = "完成时间")
    @TableField("DoneTime")
    private Date DoneTime;


}
