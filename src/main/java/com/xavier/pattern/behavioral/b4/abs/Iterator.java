package com.xavier.pattern.behavioral.b4.abs;

/**
 * 迭代器
 *
 * @author NewGr8Player
 */
public interface Iterator {
	/**
	 * 是否有下一个
	 *
	 * @return
	 */
	boolean hasNext();

	/**
	 * 获取下一个
	 *
	 * @return
	 */
	Object next();
}
