package com.kacen.simpleshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath:/spring-mybatis.xml"})
public class MybatisPlusConfig {
}
