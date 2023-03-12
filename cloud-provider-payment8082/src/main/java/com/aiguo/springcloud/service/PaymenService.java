package com.aiguo.springcloud.service;

import com.aiguo.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : PaymenService
 * @packageName ：com.aiguo.springcloud.service
 * @Author : aiguo
 * @Date: 2023年03月01 下午11:57
 * @Description :
 */
public interface PaymenService {

    public int create(Payment payment);

    public Payment getPaymenById(@Param("id") Long id);
}
