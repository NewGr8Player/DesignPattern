package com.xavier.principle.p5;

import java.util.ArrayList;
import java.util.List;

/**
 * 管家
 *
 * @author NewGr8Player
 */
public class Butler {

	/**
	 * 雇佣了两个仆人
	 *
	 * @return maidList
	 */
	public List<Maid> getMaidList() {
		List<Maid> maidList = new ArrayList<Maid>();
		for (int i = 0; i < 2; i++) {
			maidList.add(new Maid("maid" + i));
		}
		return maidList;
	}

	/**
	 * 安排两个仆人做饭
	 */
	public void cook() {
		List<Maid> maidList = getMaidList();
		for (Maid maid : maidList) {
			maid.cook();
		}
	}
}
