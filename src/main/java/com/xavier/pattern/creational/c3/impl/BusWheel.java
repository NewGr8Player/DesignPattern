package com.xavier.pattern.creational.c3.impl;

import com.xavier.pattern.creational.c3.abs.AbstractWheel;

/**
 * 公交车车轮
 * <br />
 * 继承并实现了
 * <ul>
 * <li>抽象车轮工厂类 {@link com.xavier.pattern.creational.c3.abs.AbstractWheel}</li>
 * </ul>
 *
 * @author NewGr8Player
 */
public class BusWheel extends AbstractWheel {

    @Override
    public AbstractWheel createWheel() {
        return new BusWheel();
    }

    @Override
    public String toString() {
        return "公交车 --- 车轮的直径是300单位";
    }
}
