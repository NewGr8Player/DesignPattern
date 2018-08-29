package com.xavier.pattern.creational.c3.impl;

import com.xavier.pattern.creational.c3.abs.AbstractWheel;

/**
 * 轿车车轮
 * <br />
 * 继承并实现了
 * <ul>
 * <li>抽象车轮工厂类 {@link com.xavier.pattern.creational.c3.abs.AbstractWheel}</li>
 * </ul>
 *
 * @author NewGr8Player
 */
public class CarWheel extends AbstractWheel {

    @Override
    public AbstractWheel createWheel() {
        return new CarWheel();
    }

    @Override
    public String toString() {
        return "小轿车 --- 车身的颜色是白色";
    }
}
