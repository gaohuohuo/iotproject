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
@ApiModel(value="Engineer对象", description="")
public class Engineer implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "工程人员ID")
    @TableId(value = "EngineerID", type = IdType.ID_WORKER_STR)
    private Integer EngineerID;

    @ApiModelProperty(value = "工程人员号码")
    @TableField("Phone")
    private String Phone;

    @ApiModelProperty(value = "工程人员姓名")
    @TableField("Name")
    private String Name;

    @ApiModelProperty(value = "是否有效")
    @TableField("Isvalid")
    private Integer Isvalid;

    @ApiModelProperty(value = "创建时间")
    @TableField("Createtime")
    private Date Createtime;

    @ApiModelProperty(value = "修改时间")
    @TableField("Updatetime")
    private Date Updatetime;

    @ApiModelProperty(value = "逻辑删除")
    @TableField("Del")
    private Integer Del;


}
