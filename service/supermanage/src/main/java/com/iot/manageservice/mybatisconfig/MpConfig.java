package com.iot.manageservice.mybatisconfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis_Plus的配制类
 */
@Configuration
@MapperScan("com.iot.manageservice.mapper")
public class MpConfig {
    /* 逻辑删除 */
    /* 乐观锁 */
    /* 分页插件 */
}
