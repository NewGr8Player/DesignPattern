package com.xavier.pattern.c5;

import com.xavier.MainTestCase;
import com.xavier.pattern.creational.c5.w1.Car;
import com.xavier.pattern.creational.c5.w1.CarBuilderImpl;
import com.xavier.pattern.creational.c5.w1.abs.CarBuilder;
import com.xavier.pattern.creational.c5.w2.CarWithInnerBuilder;
import com.xavier.pattern.creational.c5.w3.CarWithAnnotationBuilder;
import org.junit.Test;

public class BuilderPattertTest extends MainTestCase {

    @Test
    public void testForW1(){

        CarBuilder builder = new CarBuilderImpl();

        Car car = builder.setWheels(4)
                .setColor("红色")
                .build();

        System.out.println(car);
    }

    @Test
    public void testForW2(){
        CarWithInnerBuilder car = CarWithInnerBuilder.newBuilder()
                .wheels(1)
                .color("白色")
                .build();
        System.out.println(car);
    }

    @Test
    public void testForW3(){
        CarWithAnnotationBuilder car = CarWithAnnotationBuilder.builder()
                .wheels(2)
                .color("黄色")
                .build();
        System.out.println(car);
    }
}
