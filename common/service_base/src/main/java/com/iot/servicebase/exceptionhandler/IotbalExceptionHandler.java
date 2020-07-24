package com.iot.servicebase.exceptionhandler;

import com.iot.common.result.ResultBean;
import com.iot.common.utlis.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 全局异常处理类
 *
 * @author gaohuohuo
 * @Classname IotbalExceptionHandler
 * @Date 2020/7/24 14:30
 * @Version: 1.0
 */

@Slf4j
@ControllerAdvice
public class IotbalExceptionHandler {
    /**
     * 指定出现什么异常执行这个方法
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean error(Exception e) {
        e.printStackTrace ();
        return ResultBean.error ().message ( e.getMessage () );
    }

    /**
     * 特殊异常 指定是哪种类型的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public ResultBean error(ArithmeticException e) {
        e.printStackTrace ();
        return ResultBean.error ().message ( "你算术异常了>>>>>=" + e.getMessage () );
    }

    /**
     * 自定义异常  需要自己手动抛出
     *
     * @param e
     * @return
     */
    @ExceptionHandler(IotException.class)
    @ResponseBody
    public ResultBean error(IotException e) {
        //本地打印异常
        log.error ( ExceptionUtil.getMessage ( e ) );
        e.printStackTrace ();
        return ResultBean.error ().message ( e.getMsg () ).code ( e.getCode () );
    }



}
