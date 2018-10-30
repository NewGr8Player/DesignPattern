package com.xavier.pattern.behavioral.b9.impl;

import com.xavier.pattern.behavioral.b9.abs.Game;

/**
 * 扫雷
 *
 * @author NewGr8Player
 */
public class MineSweeper extends Game {

	@Override
	public void initialize() {
		System.out.println("初始化扫雷...");
	}

	@Override
	public void start() {
		/* 省略中间各种过程 */
		System.out.println("扫雷开始...");
	}

	@Override
	public void end() {
		System.out.println("扫雷结束...");
	}

}
