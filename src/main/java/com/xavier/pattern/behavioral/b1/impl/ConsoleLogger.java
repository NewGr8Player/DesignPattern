package com.xavier.pattern.behavioral.b1.impl;

import com.xavier.pattern.behavioral.b1.abs.AbstractLogger;

/**
 * 控制台日志处理器
 *
 * @author NewGr8Player
 */
public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}
}
