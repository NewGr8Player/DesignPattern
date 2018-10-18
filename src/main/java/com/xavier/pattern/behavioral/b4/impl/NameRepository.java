package com.xavier.pattern.behavioral.b4.impl;

import com.xavier.pattern.behavioral.b4.abs.Container;
import com.xavier.pattern.behavioral.b4.abs.Iterator;

public class NameRepository implements Container {

	public String names[] = {"Robert", "John", "Julie", "Lora"};

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	/**
	 * 名称 内部类
	 *
	 * @author NewGr8Player
	 */
	private class NameIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}
}