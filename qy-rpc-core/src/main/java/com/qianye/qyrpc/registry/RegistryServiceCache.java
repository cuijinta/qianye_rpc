package com.qianye.qyrpc.registry;

import com.qianye.qyrpc.model.ServiceMetaInfo;

import java.util.List;

/**
 * 注册中心服务本地缓存
 *
 * @author <a href="https://github.com/liqianye">coder_qianye</a>
 * @from <a href="https://qianye.icu">编程导航学习圈</a>
 * @learn <a href="https://codefather.cn">qianye 的编程宝典</a>
 */
public class RegistryServiceCache {

    /**
     * 服务缓存
     */
    List<ServiceMetaInfo> serviceCache;

    /**
     * 写缓存
     *
     * @param newServiceCache
     * @return
     */
    void writeCache(List<ServiceMetaInfo> newServiceCache) {
        this.serviceCache = newServiceCache;
    }

    /**
     * 读缓存
     *
     * @return
     */
    List<ServiceMetaInfo> readCache() {
        return this.serviceCache;
    }

    /**
     * 清空缓存
     */
    void clearCache() {
        this.serviceCache = null;
    }
}
