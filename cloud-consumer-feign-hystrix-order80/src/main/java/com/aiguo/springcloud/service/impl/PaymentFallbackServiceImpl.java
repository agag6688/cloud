package com.aiguo.springcloud.service.impl;

import com.aiguo.springcloud.service.PaymentHystrixService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @ClassName : PaymentFallbackServiceImpl
 * @packageName ：com.aiguo.springcloud.service.impl
 * @Author : aiguo
 * @Date: 2023年03月04 上午1:26
 * @Description :
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackServiceImpl Fallback paymentInfo_OK  ";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------PaymentFallbackServiceImpl Fallback paymentInfo_TimeOut--";
    }
}
