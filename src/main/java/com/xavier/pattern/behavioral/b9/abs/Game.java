package com.xavier.pattern.behavioral.b9.abs;

/**
 * 游戏抽象类
 *
 * @author NewGr8Player
 */
public abstract class Game {

	public abstract void initialize();

	/**
	 * 开始游戏
	 */
	public abstract void start();

	/**
	 * 结束游戏
	 */
	public abstract void end();

	/**
	 * 玩游戏
	 */
	public final void play() {

		initialize();
		start();
		end();
	}
}
