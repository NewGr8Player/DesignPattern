package com.xavier.principle.p5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 佣人
 *
 * @author NewGr8Player
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maid {

	/**
	 * 仆人名称
	 */
	private String maidName;

	/**
	 * 仆人做饭
	 */
	public void cook() {
		System.out.println(this.maidName + "正在做饭！");
	}
}
