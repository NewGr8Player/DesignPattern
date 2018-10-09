package com.xavier.pattern.structural.s1.a3;

/**
 * 接口适配器:接口中有抽象方法，我们只想实现其中的几个，不想全部实现，
 * 所以提供一个默认空实现，然后继承自它，重写实现我们想实现的方法
 *
 * @author NewGr8Player
 */
public interface IDraw {

	/**
	 * 画圆形
	 */
	void drawCircle();

	/**
	 * 画长方形
	 */
	void drawRectangle();
}
