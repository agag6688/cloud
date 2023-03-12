package com.aiguo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : com.aiguo.springcloud.PaymentMain8001
 * @packageName ：PACKAGE_NAME
 * @Author : aiguo
 * @Date: 2023年02月20 上午1:25
 * @Description : com.aiguo.springcloud
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8002 {
    public static void main(String[] args){
            System.out.println("=====启动PaymentMain8002主程序！！=====");
            SpringApplication.run(PaymentMain8002.class,args);
    }
}
