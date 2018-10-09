package com.xavier.pattern.structural.s1.a1;

/**
 * 类适配器 使用对象继承的方式，是静态的定义方式
 *
 * @author NewGr8Player
 */
public class DrawAdapter4Class extends DrawRectangle implements IDrawCircle {

	@Override
	public void drawCircle() {
		System.out.println("DrawAdapter4Class: drawCircle");
	}
}

