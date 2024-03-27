package com.qianye.qyrpc.fault.tolerant;

import com.qianye.qyrpc.model.RpcResponse;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * 转移到其他服务节点 - 容错策略
 *
 * @author <a href="https://github.com/liqianye">程序员浅夜</a>
 * @learn <a href="https://codefather.cn">浅夜的编程宝典</a>
 * @from <a href="https://qianye.icu">编程导航学习圈</a>
 */
@Slf4j
public class FailOverTolerantStrategy implements TolerantStrategy {

    @Override
    public RpcResponse doTolerant(Map<String, Object> context, Exception e) {
        // todo 可自行扩展，获取其他服务节点并调用
        return null;
    }
}
