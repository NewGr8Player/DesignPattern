package com.xavier.pattern.structural.s2;

import com.xavier.MainTestCase;
import org.junit.Test;

/**
 * 组合模式测试
 *
 * @author NewGr8Player
 */
public class CompositePatternTest extends MainTestCase {

	@Test
	public void test() {
		Ellipse ellipse1 = new Ellipse();
		Ellipse ellipse2 = new Ellipse();
		Ellipse ellipse3 = new Ellipse();
		Ellipse ellipse4 = new Ellipse();

		CompositeGraphic graphic = new CompositeGraphic();
		CompositeGraphic graphic1 = new CompositeGraphic();
		CompositeGraphic graphic2 = new CompositeGraphic();

		graphic1.add(ellipse1);
		graphic1.add(ellipse2);
		graphic1.add(ellipse3);

		graphic2.add(ellipse4);

		graphic.add(graphic1);
		graphic.add(graphic2);

		graphic.print();
	}
}
