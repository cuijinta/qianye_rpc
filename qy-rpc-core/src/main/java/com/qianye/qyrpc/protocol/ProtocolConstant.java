package com.qianye.qyrpc.protocol;

/**
 * 协议常量
 *
 * @author <a href="https://github.com/liqianye">程序员浅夜</a>
 * @from <a href="https://qianye.icu">编程导航学习圈</a>
 * @learn <a href="https://codefather.cn">浅夜的编程宝典</a>
 */
public interface ProtocolConstant {

    /**
     * 消息头长度
     */
    int MESSAGE_HEADER_LENGTH = 17;

    /**
     * 协议魔数
     */
    byte PROTOCOL_MAGIC = 0x1;

    /**
     * 协议版本号
     */
    byte PROTOCOL_VERSION = 0x1;
}
