package com.xavier.principle.p4.impl;

import com.xavier.principle.p4.abs.Human;

/**
 * 中国人
 * <br />
 * 实现了
 * <ul>
 * <li>动物接口 {@link com.xavier.principle.p4.abs.Human}</li>
 * </ul>
 */
public class Chinese implements Human {

    @Override
    public void walk() {
        System.out.println("在马路上走路...");
    }

    @Override
    public void eat() {
        System.out.println("在家吃饭...");
    }

    @Override
    public void sleep() {
        System.out.println("在卧室休息...");
    }
}
