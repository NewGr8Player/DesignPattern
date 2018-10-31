package com.xavier.pattern.behavioral.b10.abs;

/**
 * 汽车零件
 *
 * @author NewGr8Player
 */
public interface CarElement {
	/**
	 * 接收命令
	 *
	 * @param visitor
	 */
	void accept(CarElementVisitor visitor);
}