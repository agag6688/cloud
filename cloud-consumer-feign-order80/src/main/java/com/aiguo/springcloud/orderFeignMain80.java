package com.aiguo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : orderFeignMain80
 * @packageName ：com.aiguo.springcloud
 * @Author : aiguo
 * @Date: 2023年03月01 下午11:50
 * @Description :
 */
@SpringBootApplication
@EnableFeignClients
public class orderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(orderFeignMain80.class,args);
    }
}
