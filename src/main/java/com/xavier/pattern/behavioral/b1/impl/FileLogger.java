package com.xavier.pattern.behavioral.b1.impl;

import com.xavier.pattern.behavioral.b1.abs.AbstractLogger;

/**
 * 文件日志处理器
 *
 * @author NewGr8Player
 */
public class FileLogger extends AbstractLogger {

	public FileLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}
}
