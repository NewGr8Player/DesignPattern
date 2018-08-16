package com.xavier.pattern.creational.c1.s2;

/**
 * 饿汉式
 *
 * @author NewGr8Player
 */
public class Singleton02 {

	/**
	 * 这种方式是线程安全的，
	 * 不过不足的一点是，即使没有调用getInstance方法，也会产生他的实例。
	 * 之前的懒汉式的方式是懒加载的思想，在需要的时候创建。
	 */
	private static final Singleton02 singleton = new Singleton02();

	private Singleton02() {
	}

	public static Singleton02 getInstance() {
		return singleton;
	}
}

