package com.shop.service.api.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 会员接口服务启动类
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/8/7 0:03
 */
@SpringBootApplication
@EnableEurekaClient
public class ShopServiceApiMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopServiceApiMemberApplication.class, args);
    }

}
