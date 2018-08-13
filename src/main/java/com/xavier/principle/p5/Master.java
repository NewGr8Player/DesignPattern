package com.xavier.principle.p5;

/**
 * 主人
 *
 * @author NewGr8Player
 */
public class Master {

	/**
	 * 告诉管家，做饭
	 *
	 * @param butler
	 */
	public void cookCommand(Butler butler) {
		butler.cook();
	}
}
