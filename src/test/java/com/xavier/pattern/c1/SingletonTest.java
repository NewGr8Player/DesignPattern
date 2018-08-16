package com.xavier.pattern.c1;

import com.xavier.MainTestCase;
import com.xavier.pattern.creational.c1.s1.Singleton01;
import com.xavier.pattern.creational.c1.s1.basic.SingletonBasic;
import com.xavier.pattern.creational.c1.s2.Singleton02;
import com.xavier.pattern.creational.c1.s3.Singleton03;
import com.xavier.pattern.creational.c1.s4.Singleton04;
import org.junit.Test;

/**
 * 单例模式测试
 *
 * @author NewGr8Player
 */
public class SingletonTest extends MainTestCase {

	/**
	 * 懒汉式的线程安全
	 */
	@Test
	public void test() {

		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println((i + 1) + ":" + SingletonBasic.getInstance());
			}
		};
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	}

	/**
	 * 优化后的懒汉式
	 */
	@Test
	public void test01() {

		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println((i + 1) + ":" + Singleton01.getInstance());
			}
		};
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	}

	/**
	 * 饿汉式
	 */
	@Test
	public void test02() {
		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println((i + 1) + ":" + Singleton02.getInstance());
			}
		};
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	}

	/**
	 * 静态内部类
	 */
	@Test
	public void test03() {
		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println((i + 1) + ":" + Singleton03.getInstance());
			}
		};
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	}

	/**
	 * 枚举
	 */
	@Test
	public void test04() {
		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println((i + 1) + ":" + Singleton04.INSTANCE.hashCode());
			}
		};
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	}

}
