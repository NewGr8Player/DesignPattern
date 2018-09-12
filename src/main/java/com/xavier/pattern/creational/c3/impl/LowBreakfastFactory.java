package com.xavier.pattern.creational.c3.impl;

import com.xavier.pattern.creational.c3.CheapBuns;
import com.xavier.pattern.creational.c3.CheapSoyMilk;
import com.xavier.pattern.creational.c3.abs.Breakfast;
import com.xavier.pattern.creational.c3.abs.BreakfastFactory;

/**
 * 普通的早餐店
 *
 * @author NewGr8player
 */
public class LowBreakfastFactory implements BreakfastFactory {
	@Override
	public Breakfast sellBuns() {
		return new CheapBuns();
	}

	@Override
	public Breakfast sellSoyMilk() {
		return new CheapSoyMilk();
	}
}
