package com.aiguo.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName : Payment
 * @packageName ：com.aiguo.springcloud.entity
 * @Author : aiguo
 * @Date: 2023年03月01 下午11:58
 * @Description :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class  Payment {

    private Long id;

    private String serial;

}
