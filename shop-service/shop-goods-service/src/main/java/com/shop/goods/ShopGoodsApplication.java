package com.shop.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *
 * @author marxbo
 * @version 1.0
 * @date 2021/1/9 14:21
 */
@SpringBootApplication
@MapperScan("com.shop.goods.mapper")
public class ShopGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopGoodsApplication.class, args);
    }

}
