package com.shop.service.impl.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 微信服务启动类
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/8/5 23:45
 */
@SpringBootApplication
@EnableEurekaClient
public class ShopServiceImplWeixinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopServiceImplWeixinApplication.class, args);
    }

}
