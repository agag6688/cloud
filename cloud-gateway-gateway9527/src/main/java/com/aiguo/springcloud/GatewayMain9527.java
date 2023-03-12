package com.aiguo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : GatewayMain9527
 * @packageName ：com.aiguo.springcloud
 * @Author : aiguo
 * @Date: 2023年03月08 上午12:44
 * @Description :
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527 {

    public static void main(String[] args) {
        SpringApplication.run(GatewayMain9527.class,args);
    }
}
