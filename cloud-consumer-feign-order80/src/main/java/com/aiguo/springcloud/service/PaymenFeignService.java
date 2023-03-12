package com.aiguo.springcloud.service;

import com.aiguo.springcloud.entity.CommonResult;
import com.aiguo.springcloud.entity.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName : PaymenFeignService
 * @packageName ：com.aiguo.springcloud.service
 * @Author : aiguo
 * @Date: 2023年03月01 下午11:55
 * @Description :
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymenFeignService {

     @GetMapping(value = "/payment/get/{id}")
     public CommonResult<Payment> getPaymenById(@PathVariable("id") Long id);

     @GetMapping(value = "/payment/feign/timeout")
     public String paymentFeignTimeout();
}
