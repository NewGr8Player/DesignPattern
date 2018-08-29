package com.xavier.pattern.c3;

import com.xavier.MainTestCase;
import com.xavier.pattern.creational.c3.Vehicle;
import com.xavier.pattern.creational.c3.impl.BusFactory;
import com.xavier.pattern.creational.c3.impl.CarFactory;
import org.junit.Test;


public class AbstractFactoryPatternTest extends MainTestCase {

    @Test
    public void test() {

        CarFactory carFactory = new CarFactory();

        Vehicle car = carFactory.createVehicle();

        System.out.println(car);
    }

    @Test
    public void test1() {
        BusFactory busFactory = new BusFactory();

        Vehicle bus = busFactory.createVehicle();

        System.out.println(bus);
    }
}
