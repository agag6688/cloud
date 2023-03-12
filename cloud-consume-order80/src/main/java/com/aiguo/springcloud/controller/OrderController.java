package com.aiguo.springcloud.controller;

import com.aiguo.springcloud.entity.CommonResult;
import com.aiguo.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName : OrderController
 * @packageName ：com.aiguo.springcloud.controller
 * @Author : aiguo
 * @Date: 2023年02月23 上午1:00
 * @Description :
 */
@RestController
@Slf4j
public class OrderController {

//    public static final String PAYMENT_URL = "http://localhost:8081";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public CommonResult test(){
        return restTemplate.getForObject(PAYMENT_URL+"/test",CommonResult.class );
    }

    @GetMapping(value = "/consumer/payment/create")
    public CommonResult create( Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymenById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/"+id, CommonResult.class);
    }
}
