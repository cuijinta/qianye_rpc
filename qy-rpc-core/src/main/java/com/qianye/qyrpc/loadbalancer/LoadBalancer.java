package com.qianye.qyrpc.loadbalancer;

import com.qianye.qyrpc.model.ServiceMetaInfo;

import java.util.List;
import java.util.Map;

/**
 * 负载均衡器（消费端使用）
 *
 * @author <a href="https://github.com/liqianye">程序员浅夜</a>
 * @learn <a href="https://codefather.cn">浅夜的编程宝典</a>
 * @from <a href="https://qianye.icu">编程导航学习圈</a>
 */
public interface LoadBalancer {

    /**
     * 选择服务调用
     *
     * @param requestParams       请求参数
     * @param serviceMetaInfoList 可用服务列表
     * @return
     */
    ServiceMetaInfo select(Map<String, Object> requestParams, List<ServiceMetaInfo> serviceMetaInfoList);
}
