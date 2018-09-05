package com.xavier.principle.p1.abs;

/**
 * 通信连接接口
 *
 * @author NewGr8Player
 */
public interface ConnectionManager {

    /**
     * 拨打电话
     *
     * @param phoneNumber
     */
    void dail(String phoneNumber);

    /**
     * 挂断电话
     */
    void hangup();
}
