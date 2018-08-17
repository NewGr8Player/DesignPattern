package com.xavier.pattern.creational.c2.abs;

/**
 * 人类工厂抽象类
 *
 * @author NewGr8Player
 */
public abstract class AbstractHumanFactory {
	/**
	 * 人类创建方法
	 *
	 * @return
	 */
	public abstract <T extends Human> T createHuman(Class<T> human);
}
