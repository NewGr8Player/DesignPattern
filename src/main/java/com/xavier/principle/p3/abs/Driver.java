package com.xavier.principle.p3.abs;

/**
 * 驾驶员接口
 *
 * @author NewGr8Player
 */
public interface Driver {

	/**
	 * 司机都可以开车
	 *
	 * @param car
	 */
	default void drive(Car car) {
		System.out.println("开始驾驶");
		car.start();
	}
}
