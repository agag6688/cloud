package com.aiguo.springcloud.dao;

import com.aiguo.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : PaymentDao
 * @packageName ：com.aiguo.springcloud.dao
 * @Author : aiguo
 * @Date: 2023年03月02 上午12:28
 * @Description :
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymenById(@Param("id") Long id);
}
