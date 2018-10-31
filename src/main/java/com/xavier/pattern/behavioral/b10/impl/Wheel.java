package com.xavier.pattern.behavioral.b10.impl;

import com.xavier.pattern.behavioral.b10.abs.CarElement;
import com.xavier.pattern.behavioral.b10.abs.CarElementVisitor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 轮子
 *
 * @author NewGr8Player
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Wheel implements CarElement {

	private String name;


	public void accept(final CarElementVisitor visitor) {
		visitor.visit(this);
	}
}
