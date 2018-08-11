package com.xavier.principle.p4.abs;

/**
 * 鸟类接口
 * <br />
 * 继承了
 * <ul>
 * <li>动物接口 {@link com.xavier.principle.p4.abs.Animal}</li>
 * </ul>
 */
public interface Bird extends Animal {

    /**
     * 鸟类可以飞翔
     */
    void fly();
}
