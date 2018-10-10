package com.xavier.pattern.structural.s7;

import com.xavier.MainTestCase;
import org.junit.Test;

/**
 * 享元模式测试
 *
 * @author NewGr8Player
 */
public class FlyweightPatternTest extends MainTestCase {

	@Test
	public void test() {
		final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

		for (int i = 0; i < 20; ++i) {
			Circle circle =
					(Circle) ShapeFactory.getCircle(colors[(int) (Math.random() * colors.length)]);
			circle.setX((int) (Math.random() * 100));
			circle.setY((int) (Math.random() * 100));
			circle.setRadius(100);
			circle.draw();
		}
	}


}
