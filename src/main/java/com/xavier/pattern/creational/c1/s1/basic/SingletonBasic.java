package com.xavier.pattern.creational.c1.s1.basic;

/**
 * 懒汉式的线程安全
 *
 * @author NewGr8Player
 */
public class SingletonBasic {

	private static SingletonBasic singleton = null;

	private SingletonBasic() {
	}

	public synchronized static SingletonBasic getInstance() {
		if (singleton == null) {
			singleton = new SingletonBasic();
		}
		return singleton;
	}
}

