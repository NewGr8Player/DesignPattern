package com.xavier.pattern.structural.s6.impl;

import com.xavier.pattern.structural.s6.abs.Driver;

/**
 * Mysql连接驱动实现
 */
public class MysqlDriver implements Driver {

	@Override
	public void connect() {
		System.out.println("连接Mysql数据库");
	}
}

