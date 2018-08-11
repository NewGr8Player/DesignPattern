package com.xavier.principle.p3.impl;

import com.xavier.principle.p3.abs.Car;
import com.xavier.principle.p3.abs.Driver;
import lombok.NoArgsConstructor;

/**
 * 人工智能司机
 * <br />
 * 实现了
 * <ul>
 * <li>驾驶员接口 {@link com.xavier.principle.p3.abs.Driver}</li>
 * </ul>
 */
@NoArgsConstructor
public class AIDriver implements Driver {

	@Override
	public void drive(Car car) {
		System.out.println("开始自动驾驶...");
		car.start();
	}
}
