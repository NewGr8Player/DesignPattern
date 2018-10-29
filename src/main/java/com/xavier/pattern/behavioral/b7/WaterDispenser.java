package com.xavier.pattern.behavioral.b7;

import com.xavier.pattern.behavioral.b7.abs.DispenserState;
import com.xavier.pattern.behavioral.b7.impl.NullState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 饮水机
 *
 * @author NewGr8player
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WaterDispenser {

	private DispenserState dispenserState;

	private static int capacity = 20;

	public void press() {
		capacity--;
		if (capacity == 0) {
			dispenserState = new NullState();
		}
		dispenserState.press();
	}
}
