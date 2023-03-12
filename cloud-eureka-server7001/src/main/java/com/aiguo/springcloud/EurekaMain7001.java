package com.aiguo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName : EurekaMain7001
 * @packageName ：com.aiguo.springcloud
 * @Author : aiguo
 * @Date: 2023年02月23 下午8:02
 * @Description :
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        System.out.println("=====启动EurekaMain7001=======");
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
