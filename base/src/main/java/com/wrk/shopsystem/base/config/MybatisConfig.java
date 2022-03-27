package com.wrk.shopsystem.base.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.wrk.shopsystem.base.mapper", "com.wrk.shopsystem.base.dao"})
public class MybatisConfig {

}
