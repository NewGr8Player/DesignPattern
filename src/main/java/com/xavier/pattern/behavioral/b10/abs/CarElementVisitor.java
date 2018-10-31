package com.xavier.pattern.behavioral.b10.abs;

import com.xavier.pattern.behavioral.b10.impl.Body;
import com.xavier.pattern.behavioral.b10.impl.Car;
import com.xavier.pattern.behavioral.b10.impl.Engine;
import com.xavier.pattern.behavioral.b10.impl.Wheel;

/**
 * 汽车的访问者接口
 *
 * @author NewGr8Player
 */
public interface CarElementVisitor {
	/**
	 * 车身
	 *
	 * @param body
	 */
	void visit(Body body);

	/**
	 * 汽车
	 *
	 * @param car
	 */
	void visit(Car car);

	/**
	 * 引擎
	 *
	 * @param engine
	 */
	void visit(Engine engine);

	/**
	 * 车轮
	 *
	 * @param wheel
	 */
	void visit(Wheel wheel);
}
