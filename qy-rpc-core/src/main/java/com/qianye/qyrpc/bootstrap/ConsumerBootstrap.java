package com.qianye.qyrpc.bootstrap;

import com.qianye.qyrpc.RpcApplication;

/**
 * 服务消费者启动类（初始化）
 *
 * @author <a href="https://github.com/liqianye">程序员浅夜</a>
 * @learn <a href="https://codefather.cn">浅夜的编程宝典</a>
 * @from <a href="https://qianye.icu">编程导航学习圈</a>
 */
public class ConsumerBootstrap {

    /**
     * 初始化
     */
    public static void init() {
        // RPC 框架初始化（配置和注册中心）
        RpcApplication.init();
    }

}
