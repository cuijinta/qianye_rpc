package com.qianye.qyrpc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 服务注册信息类
 *
 * @author <a href="https://github.com/liqianye">程序员浅夜</a>
 * @from <a href="https://qianye.icu">编程导航学习圈</a>
 * @learn <a href="https://codefather.cn">浅夜的编程宝典</a>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceRegisterInfo<T> {

    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 实现类
     */
    private Class<? extends T> implClass;
}
