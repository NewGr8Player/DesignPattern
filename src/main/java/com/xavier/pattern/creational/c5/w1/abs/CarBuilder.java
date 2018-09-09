package com.xavier.pattern.creational.c5.w1.abs;

import com.xavier.pattern.creational.c5.w1.Car;

/**
 * 生成器接口
 */
public interface CarBuilder {
    Car build();

    CarBuilder setColor(final String color);

    CarBuilder setWheels(final int wheels);
}
