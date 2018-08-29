package com.xavier.pattern.creational.c3.abs;

import com.xavier.pattern.creational.c3.Vehicle;

/**
 * 抽象交通工具类
 *
 * @author NewGr8Player
 */
public abstract class AbstractVehicle {

    /**
     * 交通工具制造方法
     *
     * @return
     */
    public abstract Vehicle createVehicle();
}
