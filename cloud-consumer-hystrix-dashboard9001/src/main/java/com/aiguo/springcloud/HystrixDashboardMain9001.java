package com.aiguo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * @ClassName : HystrixDashboardMain9001
 * @packageName ：com.aiguo.springcloud
 * @Author : aiguo
 * @Date: 2023年03月07 上午1:14
 * @Description :
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }

}
