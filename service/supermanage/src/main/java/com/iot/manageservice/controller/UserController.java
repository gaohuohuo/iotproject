package com.iot.manageservice.controller;


import com.iot.common.result.ResultBean;
import com.iot.manageservice.service.UserService;
import com.iot.servicebase.exceptionhandler.IotException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author GaoHuoHuo
 * @since 2020-07-24
 */
@RestController
@RequestMapping("/manageservice/user")
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping("init")
    public ResultBean init() {
        return ResultBean.ok().message("这是我的第一个测试");
    }

    @GetMapping("ext")
    public ResultBean exten() {

        try {
          int i = 1/0;
        } catch (Exception e) {

            throw new IotException(2001, "莫名其妙出错了");
        }

        return ResultBean.ok().message("这是我的第二个测试");
    }
}

