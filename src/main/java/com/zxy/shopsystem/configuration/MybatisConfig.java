package com.zxy.shopsystem.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.zxy.shopsystemdemo.mapper","com.zxy.shopsystemdemo.dao"})
public class MybatisConfig {

}
