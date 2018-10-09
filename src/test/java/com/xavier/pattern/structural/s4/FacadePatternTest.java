package com.xavier.pattern.structural.s4;

import com.xavier.MainTestCase;
import org.junit.Test;

/**
 * 外观模式测试
 *
 * @author NewGr8Player
 */
public class FacadePatternTest extends MainTestCase {

	@Test
	public void test(){
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
	}
}
