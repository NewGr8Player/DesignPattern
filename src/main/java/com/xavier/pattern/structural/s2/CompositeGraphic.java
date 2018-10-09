package com.xavier.pattern.structural.s2;

import java.util.ArrayList;
import java.util.List;

/**
 * 图形组合类[Composite]
 *
 * @author NewGr8Player
 */
public class CompositeGraphic implements Graphic {

	/**
	 * 子图形集合
	 */
	private List<Graphic> childGraphics = new ArrayList<Graphic>();

	/**
	 * 打印图形
	 */
	@Override
	public void print() {
		for (Graphic graphic : childGraphics) {
			graphic.print();
		}
	}

	/**
	 * 添加图形
	 *
	 * @param graphic
	 */
	public void add(Graphic graphic) {
		childGraphics.add(graphic);
	}

	/**
	 * 移除图形
	 *
	 * @param graphic
	 */
	public void remove(Graphic graphic) {
		childGraphics.remove(graphic);
	}
}
