package com.xavier.pattern.creational.c3.impl;

import com.xavier.pattern.creational.c3.abs.AbstractBody;

/**
 * 轿车车身
 * <br />
 * 继承并实现了
 * <ul>
 * <li>抽象车身工厂类 {@link com.xavier.pattern.creational.c3.abs.AbstractBody}</li>
 * </ul>
 *
 * @author NewGr8Player
 */
public class CarBody extends AbstractBody {

    @Override
    public AbstractBody createBody() {
        return new CarBody();
    }

    @Override
    public String toString() {
        return "小轿车 --- 车轮直径是200单位";
    }
}
