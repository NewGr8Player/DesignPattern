package com.xavier.principle.p4.impl;

import com.xavier.principle.p4.abs.Bird;

/**
 * 麻雀
 * <br />
 * 实现了
 * <ul>
 * <li>动物接口 {@link com.xavier.principle.p4.abs.Bird}</li>
 * </ul>
 */
public class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("在天空飞翔...");
    }

    @Override
    public void eat() {
        System.out.println("在地面吃食物...");
    }

    @Override
    public void sleep() {
        System.out.println("在树枝上睡觉...");
    }
}
