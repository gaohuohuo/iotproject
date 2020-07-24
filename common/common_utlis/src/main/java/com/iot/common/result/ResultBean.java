package com.iot.common.result;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一响应格式
 * @author gaohuohuo
 * @Classname ResultBean
 * @Date 2020/5/7 10:24
 * @Version: 1.0
 */
@ApiModel(value="ResultBean对象", description="全局响应格式")
@Data
public class ResultBean {
    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<String, Object> ();

    /**
     * 构造器私有
     */
   private ResultBean(){};

    //成功静态方法
    public static com.iot.common.result.ResultBean ok() {
        com.iot.common.result.ResultBean r = new com.iot.common.result.ResultBean();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }

    //失败静态方法
    public static com.iot.common.result.ResultBean error() {
        com.iot.common.result.ResultBean r = new com.iot.common.result.ResultBean();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }


    /**
     * 以下都是链式编程
     * @param success
     * @return
     */
    public com.iot.common.result.ResultBean success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public com.iot.common.result.ResultBean message(String message){
        this.setMessage(message);
        return this;
    }

    public com.iot.common.result.ResultBean code(Integer code){
        this.setCode(code);
        return this;
    }

    public com.iot.common.result.ResultBean data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public com.iot.common.result.ResultBean data(Map<String, Object> map){
        this.setData(map);
        return this;
    }

    /*public static void main(String[] args) {
        ResultBean bean = ResultBean.ok ()
                .message ( "试着玩玩" )
                .code(ResultCode.SUCCESS);
        System.out.println (bean);
    }*/

}
