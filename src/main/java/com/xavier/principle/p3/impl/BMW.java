package com.xavier.principle.p3.impl;

import com.xavier.principle.p3.abs.Car;

/**
 * 奔驰
 * <br />
 * 实现了
 * <ul>
 * <li>汽车接口 {@link com.xavier.principle.p3.abs.Car}</li>
 * </ul>
 */
public class BMW implements Car {

	@Override
	public void start() {
		System.out.println("宝马启动...");
	}
}
