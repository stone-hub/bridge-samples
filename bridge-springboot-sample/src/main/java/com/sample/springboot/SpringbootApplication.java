package com.sample.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Jay
 * @version v1.0
 * @description 请添加类描述
 * @date 2019-01-16 14:33
 */
@ImportResource(locations = {"classpath:test-context.xml"})
@SpringBootApplication
@EnableConfigurationProperties(value = com.sample.springboot.TwoBO.class)
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}

