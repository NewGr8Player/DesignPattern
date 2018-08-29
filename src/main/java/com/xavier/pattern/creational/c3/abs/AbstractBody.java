package com.xavier.pattern.creational.c3.abs;

/**
 * 抽象车身工厂类
 *
 * @author NewGr8Player
 */
public abstract class AbstractBody {

    /**
     * 生产车身
     *
     * @return
     */
    public abstract AbstractBody createBody();
}
