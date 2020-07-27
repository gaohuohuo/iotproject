package com.iot.manageservice.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.iot.common.result.ResultBean;
import com.iot.manageservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author GaoHuoHuo
 * @since 2020-07-24
 */
@RestController
@RequestMapping("/manageservice/address")
public class AddressController {

    @Autowired
    private AddressService addressService;
//vffg
}

