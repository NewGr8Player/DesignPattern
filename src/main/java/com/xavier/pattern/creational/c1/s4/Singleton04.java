package com.xavier.pattern.creational.c1.s4;


/**
 * 枚举
 *
 * @author NewGr8Player
 */
public enum Singleton04 {

	INSTANCE;

	private int num = 0;

	Singleton04() {
		num++;
	}

	public int getInstance() {
		return num;
	}
}