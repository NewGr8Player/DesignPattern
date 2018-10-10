package com.xavier.pattern.structural.s6;

/**
 * 桥接实现
 *
 * @author NewGr8Player
 */
public class MyBridge extends Bridge {

	@Override
	public void connect() {
		driver.connect();
	}
}
