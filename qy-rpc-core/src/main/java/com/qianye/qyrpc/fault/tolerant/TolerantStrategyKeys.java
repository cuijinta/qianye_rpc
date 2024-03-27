package com.qianye.qyrpc.fault.tolerant;

/**
 * 容错策略键名常量
 *
 * @author <a href="https://github.com/liqianye">程序员浅夜</a>
 * @learn <a href="https://codefather.cn">浅夜的编程宝典</a>
 * @from <a href="https://qianye.icu">编程导航学习圈</a>
 */
public interface TolerantStrategyKeys {

    /**
     * 故障恢复
     */
    String FAIL_BACK = "failBack";

    /**
     * 快速失败
     */
    String FAIL_FAST = "failFast";

    /**
     * 故障转移
     */
    String FAIL_OVER = "failOver";

    /**
     * 静默处理
     */
    String FAIL_SAFE = "failSafe";

}
