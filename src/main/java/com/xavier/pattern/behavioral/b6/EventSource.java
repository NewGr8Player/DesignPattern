package com.xavier.pattern.behavioral.b6;

import java.util.Date;
import java.util.Observable;

/**
 * 事件源
 *
 * @author NewGr8Player
 */
class EventSource extends Observable implements Runnable {

	@Override
	public void run() {
		while (true) {
			String response = new Date().toString();
			setChanged();
			notifyObservers(response);
		}
	}
}
