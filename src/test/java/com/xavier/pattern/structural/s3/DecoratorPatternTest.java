package com.xavier.pattern.structural.s3;

import com.xavier.MainTestCase;
import com.xavier.pattern.structural.s3.abs.Shape;
import com.xavier.pattern.structural.s3.impl.Circle;
import com.xavier.pattern.structural.s3.impl.Rectangle;
import org.junit.Test;

/**
 * 装饰模式测试
 *
 * @author NewGr8Player
 */
public class DecoratorPatternTest extends MainTestCase {

	@Test
	public void test() {
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
