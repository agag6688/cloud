package com.aiguo.springcloud;

import com.aiguo.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * @ClassName : OrderMain80
 * @packageName ：com.aiguo.springcloud
 * @Author : aiguo
 * @Date: 2023年02月23 上午12:50
 * @Description :
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        System.out.println("===order80启动====");
        SpringApplication.run(OrderMain80.class,args);
    }
}
