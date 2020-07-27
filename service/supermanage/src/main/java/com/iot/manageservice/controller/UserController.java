package com.iot.manageservice.controller;


import com.iot.common.result.ResultBean;
import com.iot.manageservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author GaoHuoHuo
 * @since 2020-07-24
 */
@RestController
@RequestMapping("/manageservice/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("init")
    public ResultBean init(){
        return ResultBean.ok().message("这是一个描述").data("users",userService.list(null));
    }


    @GetMapping("init2")
    public ResultBean init1(){
        return ResultBean.ok().message("这是一个描述").data("users",userService.list(null));
    }

}

