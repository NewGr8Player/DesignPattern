package com.xavier.pattern.creational.c1.s1;

/**
 * 优化了效率的懒汉式
 *
 * @author NewGr8Player
 */
public class Singleton01 {

	/**
	 * singleton = new SingletonBasic()不是原子操作，在JVM中大致做了三件事情：
	 *
	 * <ol>
	 * <li> 给instance分配内存。</li>
	 * <li> 通过其构造函数初始化成员变量。</li>
	 * <li> 将instance指向分配的内存空间。（执行完instance就不是null了）。</li>
	 * </ol>
	 * 但是在JVM编译器中存在指令重新排序的优化，最终的执行顺序是1-2-3或者1-3-2，如果是1-3-2的话，
	 * 那么在3执行完毕，2执行之前，线程A被线程B抢断的话，instance非空，线程B会直接返回instance，这个时候，直接使用就会报错。
	 * 给出的解决方式(使用volatile关键字屏蔽重排序)
	 */
	private volatile static Singleton01 singleton = null;

	private Singleton01() {
	}

	public static Singleton01 getInstance() {

		if (singleton == null)
			synchronized (Singleton01.class) {

				if (singleton == null) {
					singleton = new Singleton01();
				}
			}

		return singleton;
	}
}

