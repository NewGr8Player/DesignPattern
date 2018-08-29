package com.xavier.pattern.creational.c3.impl;

import com.xavier.pattern.creational.c3.Vehicle;
import com.xavier.pattern.creational.c3.abs.AbstractVehicle;

/**
 * 公交车工厂类
 * <br />
 * 继承并实现了
 * <ul>
 * <li>抽象交通工具工厂类 {@link AbstractVehicle}</li>
 * </ul>
 *
 * @author NewGr8Player
 */
public class BusFactory extends AbstractVehicle {

    @Override
    public Vehicle createVehicle() {
        return new Vehicle(
                new BusBody().createBody(),
                new BusWheel().createWheel()
        );
    }
}
