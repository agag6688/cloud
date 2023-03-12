package com.aiguo.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : FeignConfig
 * @packageName ：com.aiguo.springcloud.config
 * @Author : aiguo
 * @Date: 2023年03月02 下午9:57
 * @Description :
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
