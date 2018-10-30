package com.xavier.pattern.behavioral.b9;

import com.xavier.pattern.behavioral.b9.abs.Game;
import com.xavier.pattern.behavioral.b9.impl.MineSweeper;
import org.junit.Test;

/**
 * 模版模式测试
 *
 * @author NewGr8Player
 */
public class TemplatePatternTest {

	@Test
	public void test() {
		Game game = new MineSweeper();
		game.play();
	}

}
