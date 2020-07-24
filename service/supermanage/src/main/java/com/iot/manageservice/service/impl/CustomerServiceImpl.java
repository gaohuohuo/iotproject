package com.iot.manageservice.service.impl;

import com.iot.manageservice.pojo.Customer;
import com.iot.manageservice.mapper.CustomerMapper;
import com.iot.manageservice.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author GaoHuoHuo
 * @since 2020-07-24
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
