package com.xavier.pattern.creational.c3.impl;

import com.xavier.pattern.creational.c3.ExpensiveBuns;
import com.xavier.pattern.creational.c3.ExpensiveSoyMilk;
import com.xavier.pattern.creational.c3.abs.Breakfast;
import com.xavier.pattern.creational.c3.abs.BreakfastFactory;

/**
 * 高级早餐店
 *
 * @author NewGr8Player
 */
public class AdvBreakfastFactory implements BreakfastFactory {

	@Override
	public Breakfast sellBuns() {
		return new ExpensiveBuns();
	}

	@Override
	public Breakfast sellSoyMilk() {
		return new ExpensiveSoyMilk();
	}
}
