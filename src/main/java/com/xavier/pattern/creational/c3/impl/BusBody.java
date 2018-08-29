package com.xavier.pattern.creational.c3.impl;


import com.xavier.pattern.creational.c3.abs.AbstractBody;


/**
 * 公交车车身
 * <br />
 * 继承并实现了
 * <ul>
 * <li>抽象车身工厂类 {@link com.xavier.pattern.creational.c3.abs.AbstractBody}</li>
 * </ul>
 *
 * @author NewGr8Player
 */
public class BusBody extends AbstractBody {

    @Override
    public AbstractBody createBody() {
        return new BusBody();
    }

    @Override
    public String toString() {
        return "公交车 --- 车身的颜色是绿色";
    }
}
