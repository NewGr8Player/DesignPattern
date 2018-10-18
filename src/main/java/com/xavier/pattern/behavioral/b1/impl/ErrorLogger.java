package com.xavier.pattern.behavioral.b1.impl;

import com.xavier.pattern.behavioral.b1.abs.AbstractLogger;

/**
 * 错误信息日志处理器
 *
 * @author NewGr8Player
 */
public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}
}
