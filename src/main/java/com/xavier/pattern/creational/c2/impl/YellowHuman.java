package com.xavier.pattern.creational.c2.impl;

import com.xavier.pattern.creational.c2.abs.Human;

/**
 * 白色人种
 * <br />
 * 实现了
 * <ul>
 * <li>人类接口 {@link com.xavier.pattern.creational.c2.abs.Human}</li>
 * </ul>
 *
 * @author NewGr8Player
 */
public class YellowHuman implements Human {

	@Override
	public String getSkinColor() {
		return "黄色";
	}

	@Override
	public String say() {
		return "你好";
	}
}
