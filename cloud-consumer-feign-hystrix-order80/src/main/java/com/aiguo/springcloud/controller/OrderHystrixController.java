package com.aiguo.springcloud.controller;

import com.aiguo.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : PaymentHystrixController
 * @packageName ：com.aiguo.springcloud.controller
 * @Author : aiguo
 * @Date: 2023年03月02 下午11:48
 * @Description :
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_OK(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
////            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
////    })
    @HystrixCommand
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
//        int a = 10/0;
        return paymentHystrixService.paymentInfo_TimeOut(id);
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "80消费者系统繁忙 \t 线程池："+Thread.currentThread().getName()+"  paymentInfo_TimeOutHandler,id = "+id+"\t"+"😭";
    }

    /****全局的fallback方法***/
    public String payment_Global_FallbackMethod(){
        return "Global异常信息处理，请稍后！！！";
    }
}
