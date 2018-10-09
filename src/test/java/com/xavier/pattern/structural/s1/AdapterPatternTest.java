package com.xavier.pattern.structural.s1;

import com.xavier.MainTestCase;
import com.xavier.pattern.structural.s1.a1.DrawAdapter4Class;
import com.xavier.pattern.structural.s1.a1.DrawRectangle;
import com.xavier.pattern.structural.s1.a3.MyDrawAdapter;
import com.xavier.pattern.structural.s1.a2.DrawAdapter4Object;
import org.junit.Test;

/**
 * 适配器模式测试
 *
 * @author NewGr8player
 */
public class AdapterPatternTest extends MainTestCase {

	@Test
	public void test() {
		/* 对象适配器	 */
		DrawAdapter4Object objAdapter = new DrawAdapter4Object(new DrawRectangle());
		objAdapter.drawCircle();
		objAdapter.drawRectangle(" in DrawAdapter4Object");
		/* 类适配器 */
		DrawAdapter4Class clzAdapter = new DrawAdapter4Class();
		clzAdapter.drawCircle();
		clzAdapter.drawRectangle("in DrawAdapter4Class");
		/* 接口适配器 */
		MyDrawAdapter myDrawAdapter = new MyDrawAdapter();
		myDrawAdapter.drawCircle();
		myDrawAdapter.drawRectangle();
	}
}
