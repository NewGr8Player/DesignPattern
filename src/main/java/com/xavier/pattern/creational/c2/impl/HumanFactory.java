package com.xavier.pattern.creational.c2.impl;

import com.xavier.pattern.creational.c2.abs.AbstractHumanFactory;
import com.xavier.pattern.creational.c2.abs.Human;

/**
 * 人类工厂实现
 * <br />
 * 实现了
 * <ul>
 * <li>人类工厂抽象类 {@link com.xavier.pattern.creational.c2.abs.Human}</li>
 * </ul>
 *
 * @author NewGr8Player
 */
public class HumanFactory extends AbstractHumanFactory {

	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("人种生成错误!");
		}
		return (T) human;
	}
}
