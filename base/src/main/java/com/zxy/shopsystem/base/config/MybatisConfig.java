package com.zxy.shopsystem.base.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.zxy.shopsystem.base.mapper", "com.zxy.shopsystem.base.dao"})
public class MybatisConfig {

}
