package com.shop.service.api.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 微信接口服务启动类
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/8/6 23:54
 */
@SpringBootApplication
@EnableEurekaClient
public class ShopServiceApiWeixinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopServiceApiWeixinApplication.class, args);
    }

}
