package com.iot.test;

import com.iot.common.result.ResultBean;
import com.iot.manageservice.pojo.Address;
import com.iot.manageservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Test {

    @Autowired
    private AddressService addressService;

    @org.junit.Test
    public void t1() {
        List<Address> list = addressService.list(null);

        System.out.println(ResultBean.ok().data("list", list));
    }


}
