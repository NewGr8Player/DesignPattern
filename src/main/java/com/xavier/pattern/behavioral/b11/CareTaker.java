package com.xavier.pattern.behavioral.b11;

import java.util.ArrayList;
import java.util.List;

/**
 * 车辆操作
 *
 * @author NewGr8Player
 */
public class CareTaker {

	private List<Memento> mementoList = new ArrayList<>();

	public void add(Memento state){
		mementoList.add(state);
	}

	public Memento get(int index){
		return mementoList.get(index);
	}
}
