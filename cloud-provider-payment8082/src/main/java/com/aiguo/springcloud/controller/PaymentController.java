package com.aiguo.springcloud.controller;

import com.aiguo.springcloud.entity.CommonResult;
import com.aiguo.springcloud.entity.Payment;
import com.aiguo.springcloud.service.PaymenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName : PaymentController
 * @packageName ：com.aiguo.springcloud.controller
 * @Author : aiguo
 * @Date: 2023年03月02 上午12:02
 * @Description :
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;
    @Resource
    private PaymenService paymenService;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/payment/test")
    public CommonResult test(){
        return new CommonResult(200,"调用成功！"+serverPort);
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for(String element : services){
            log.info("******element="+element+"******");
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances){
            log.info("==="+instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return this.discoveryClient;
    }

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymenService.create(payment);
        log.info("*******插入结果："+result);
        if(result>0){
            return new CommonResult(200,"插入数据库成功！！"+serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库失败！！",null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymenById(@PathVariable("id") Long id){

        Payment payment = paymenService.getPaymenById(id);

        if(payment != null){
            return new CommonResult<>(200,"查询成功!!"+serverPort,payment);
        }else{
            return new CommonResult<>(444,"没有对应记录，查询ID="+id,null);
        }

    }

    @GetMapping(value = "/payment/lb")
    public String paymentLB(){
        return serverPort;
    }

}
