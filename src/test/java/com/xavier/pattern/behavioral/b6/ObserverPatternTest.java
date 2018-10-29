package com.xavier.pattern.behavioral.b6;

import com.xavier.MainTestCase;
import org.junit.Test;

/**
 * 观察者模式测试
 *
 * @author NewGr8Player
 */
public class ObserverPatternTest extends MainTestCase {

	@Test
	public void test() throws InterruptedException {
		EventSource eventSource = new EventSource();

		eventSource.addObserver(
				(obj, arg) -> System.out.println("Received response: " + obj + " - [ " + arg + " ].")
		);

		new Thread(eventSource).start();

		Thread.sleep(1000);
	}
}
