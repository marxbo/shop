package com.shop.basic.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka注册中心启动类
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/8/3 19:08
 */
@SpringBootApplication
@EnableEurekaServer
public class ShopBasicEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopBasicEurekaApplication.class, args);
    }

}
