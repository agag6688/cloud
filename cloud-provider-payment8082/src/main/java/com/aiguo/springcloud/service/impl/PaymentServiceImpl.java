package com.aiguo.springcloud.service.impl;

import com.aiguo.springcloud.dao.PaymentDao;
import com.aiguo.springcloud.entity.Payment;
import com.aiguo.springcloud.service.PaymenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author aiguo
 * @since 2023-03-02
 */
@Service
public class PaymentServiceImpl  implements PaymenService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymenById(Long id) {
        return paymentDao.getPaymenById(id);
    }
}
