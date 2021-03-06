package com.xavier.pattern.structural.s1.a2;

import com.xavier.pattern.structural.s1.a1.DrawRectangle;
import com.xavier.pattern.structural.s1.a1.IDrawCircle;

/**
 * 对象适配器： 使用对象组合的方式，是动态组合的方式。
 * 既能画方又能画圆
 * DrawAdapter是适配器，
 * DrawRectangle属于adapter,是被适配者，
 * 配器将被适配者和适配目标（DrawCircle）进行适配
 *
 * @author NewGr8Player
 */
public class DrawAdapter4Object implements IDrawCircle {

	private DrawRectangle drawRectangle;

	public DrawAdapter4Object(DrawRectangle drawRectangle) {
		this.drawRectangle = drawRectangle;
	}

	@Override
	public void drawCircle() {
		System.out.println("DrawAdapter4Object: drawcircle");
	}

	public void drawRectangle(String msg) {
		drawRectangle.drawRectangle(msg);
	}
}
