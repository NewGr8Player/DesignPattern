package com.xavier.pattern.behavioral.b1;

import com.xavier.MainTestCase;
import com.xavier.pattern.behavioral.b1.abs.AbstractLogger;
import com.xavier.pattern.behavioral.b1.impl.ConsoleLogger;
import com.xavier.pattern.behavioral.b1.impl.ErrorLogger;
import com.xavier.pattern.behavioral.b1.impl.FileLogger;
import org.junit.Before;
import org.junit.Test;

/**
 * 责任链模式测试
 *
 * @author NewGr8Player
 */
public class ChainOfResponsibilityPatternTest extends MainTestCase {

	AbstractLogger loggerChain;

	@Before
	public void getloggerInstence() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		this.loggerChain = errorLogger;
	}

	@Test
	public void test() {

		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}
}
