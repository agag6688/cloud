package com.aiguo.springcloud.controller;

import com.aiguo.springcloud.entity.CommonResult;
import com.aiguo.springcloud.entity.Payment;
import com.aiguo.springcloud.service.PaymenFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : OrderFeignController
 * @packageName ：com.aiguo.springcloud.controller
 * @Author : aiguo
 * @Date: 2023年03月02 上午12:16
 * @Description :
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymenFeignService paymenFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymenById(@PathVariable("id") Long id){
        return paymenFeignService.getPaymenById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openfeign-ribbon,客户端一般默认等待1秒
        return paymenFeignService.paymentFeignTimeout();
    }
}
