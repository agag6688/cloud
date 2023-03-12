package com.aiguo.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : MySelfRule
 * @packageName ：com.aiguo.myrule
 * @Author : aiguo
 * @Date: 2023年02月28 下午11:55
 * @Description :
 */

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
//        return new RandomRule();//定义为随机
        return new RoundRobinRule();//定义为随机
    }
}
