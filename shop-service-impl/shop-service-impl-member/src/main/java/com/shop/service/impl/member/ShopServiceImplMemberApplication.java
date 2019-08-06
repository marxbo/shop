package com.shop.service.impl.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 会员服务启动类
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/8/7 0:08
 */
@SpringBootApplication
@EnableEurekaClient
public class ShopServiceImplMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopServiceImplMemberApplication.class, args);
    }

}
