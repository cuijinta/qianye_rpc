package com.qianye.example.consumer;

import com.qianye.example.common.model.User;
import com.qianye.example.common.service.UserService;
import com.qianye.qyrpc.bootstrap.ConsumerBootstrap;
import com.qianye.qyrpc.proxy.ServiceProxyFactory;

/**
 * 服务消费者示例
 
 */
public class ConsumerExample {

    public static void main(String[] args) {
        // 服务提供者初始化
        ConsumerBootstrap.init();

        // 获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("qianye");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
