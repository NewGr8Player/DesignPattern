package com.xavier.principle.p4.abs;

/**
 * 人类接口
 * <br />
 * 继承了
 * <ul>
 * <li>动物接口 {@link com.xavier.principle.p4.abs.Animal}</li>
 * </ul>
 */
public interface Human extends Animal {

    /**
     * 人类可以走路
     */
    void walk();
}
