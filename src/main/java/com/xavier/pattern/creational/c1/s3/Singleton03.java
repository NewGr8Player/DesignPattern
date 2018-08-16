package com.xavier.pattern.creational.c1.s3;

/**
 * 饿汉式
 *
 * @author NewGr8Player
 */
public class Singleton03 {

	/**
	 * 采用了静态内部类的方式，私有的静态内部类，
	 * 外部无法访问，类似于饿汉式的形式，
	 * 但是在此基础上进行了改进，饿汉式是使用的内部属性，
	 * 而这个是使用的静态内部类的常量。
	 */
	private static class SingletonInner {
		private static final Singleton03 instance = new Singleton03();
	}

	private Singleton03() {
	}

	public static Singleton03 getInstance() {
		return SingletonInner.instance;
	}
}

