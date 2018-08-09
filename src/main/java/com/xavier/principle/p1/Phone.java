package com.xavier.principle.p1;

import com.xavier.principle.p1.service.ConnectionManager;
import com.xavier.principle.p1.service.DataTransfer;

/**
 * 电话类
 * <br />
 * 实现了
 * <ul>
 * <li>通信连接接口 {@link com.xavier.principle.p1.service.ConnectionManager}</li>
 * <li>数据传输接口 {@link com.xavier.principle.p1.service.DataTransfer}</li>
 * </ul>
 *
 * @author NewGr8Player
 */
public class Phone implements ConnectionManager, DataTransfer {

    @Override
    public void dail(String phoneNumber) {
        System.out.println("拨打号码:" + phoneNumber);
    }

    @Override
    public void hangup() {
        System.out.println("挂断电话。");
    }

    @Override
    public void dataTransfer(ConnectionManager connectionManager) {
        System.out.println("开始通话..." + connectionManager);
    }

    /**
     * 假定这个方法就是对数据进行加工处理的方法
     *
     * @return 处理后的数据与当前状态
     */
    @Override
    public String toString() {
        return "Phone{正在通话}";
    }
}
