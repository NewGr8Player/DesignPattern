package com.xavier.pattern.structural.s6.impl;

import com.xavier.pattern.structural.s6.abs.Driver;

/**
 * Sqlserver数据库连接驱动实现
 *
 * @author Newgr8Player
 */
public class SqlServerDriver implements Driver {
	@Override
	public void connect() {
		System.out.println("连接SQLServer数据库");
	}
}

