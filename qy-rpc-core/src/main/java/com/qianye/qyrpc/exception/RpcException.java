package com.qianye.qyrpc.exception;

/**
 * 自定义异常类
 *
 * @author <a href="https://github.com/liqianye">程序员浅夜</a>
 * @learn <a href="https://codefather.cn">浅夜的编程宝典</a>
 * @from <a href="https://qianye.icu">编程导航学习圈</a>
 */
public class RpcException extends RuntimeException {

    public RpcException(String message) {
        super(message);
    }

}
