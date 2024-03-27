package com.qianye.example.consumer;

import com.qianye.example.common.model.User;
import com.qianye.example.common.service.UserService;
import com.qianye.qyrpc.proxy.ServiceProxyFactory;

/**
 * 简易服务消费者示例
 
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        // 静态代理
//        UserService userService = new UserServiceProxy();
        // 动态代理 调用远程方法
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
