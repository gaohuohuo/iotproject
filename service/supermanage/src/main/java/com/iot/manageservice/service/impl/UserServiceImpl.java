package com.iot.manageservice.service.impl;

import com.iot.manageservice.pojo.User;
import com.iot.manageservice.mapper.UserMapper;
import com.iot.manageservice.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
