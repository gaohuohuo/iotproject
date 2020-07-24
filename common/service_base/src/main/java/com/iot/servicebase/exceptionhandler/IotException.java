package com.iot.servicebase.exceptionhandler;

/**
     自定义异常
 * @author gaohuohuo
 * @Classname IotException
 * @Date 2020/7/24 14:25
 * @Version: 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IotException extends RuntimeException {

    /**
     *状态码
     */
    private Integer code;
    /**
     * 异常信息
     */
    private String msg;

}
