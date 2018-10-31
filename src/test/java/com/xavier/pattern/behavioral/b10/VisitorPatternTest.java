package com.xavier.pattern.behavioral.b10;

import com.xavier.MainTestCase;
import com.xavier.pattern.behavioral.b10.impl.Car;
import com.xavier.pattern.behavioral.b10.impl.CarElementDoVisitor;
import com.xavier.pattern.behavioral.b10.impl.CarElementPrintVisitor;
import org.junit.Test;

public class VisitorPatternTest extends MainTestCase {

	@Test
	public void test() {
		final Car car = new Car();

		car.accept(new CarElementPrintVisitor());
		car.accept(new CarElementDoVisitor());
	}
}
