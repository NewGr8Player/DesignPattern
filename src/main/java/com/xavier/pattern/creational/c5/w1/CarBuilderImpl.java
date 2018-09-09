package com.xavier.pattern.creational.c5.w1;

import com.xavier.pattern.creational.c5.w1.abs.CarBuilder;

/**
 * 生成器标准实现
 *
 * @author NewGr8Player
 */
public class CarBuilderImpl implements CarBuilder {
    private Car car;

    public CarBuilderImpl() {
        car = new Car();
    }

    @Override
    public Car build() {
        return car;
    }

    @Override
    public CarBuilder setColor(final String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public CarBuilder setWheels(final int wheels) {
        car.setWheels(wheels);
        return this;
    }
}
