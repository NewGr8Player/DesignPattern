package com.xavier.pattern.creational.c2.impl;

import com.xavier.pattern.creational.c2.abs.Human;

/**
 * 黑色人种
 * <br />
 * 实现了
 * <ul>
 * <li>人类接口 {@link com.xavier.pattern.creational.c2.abs.Human}</li>
 * </ul>
 *
 * @author NewGr8Player
 */
public class BlackHuman implements Human {

	@Override
	public String getSkinColor() {
		return "黑色";
	}

	@Override
	public String say() {
		return "Wuluwuluwulu...";
	}
}
