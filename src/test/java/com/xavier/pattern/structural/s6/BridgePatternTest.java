package com.xavier.pattern.structural.s6;

import com.xavier.MainTestCase;
import com.xavier.pattern.structural.s6.abs.Driver;
import com.xavier.pattern.structural.s6.impl.MysqlDriver;
import com.xavier.pattern.structural.s6.impl.SqlServerDriver;
import org.junit.Test;

/**
 * 桥接模式测试
 *
 * @author NewGr8player
 */
public class BridgePatternTest extends MainTestCase {

	@Test
	public void test() {
		Bridge mysqlBridge = new MyBridge();

		Driver mysqlDriver = new MysqlDriver();
		mysqlBridge.setDriver(mysqlDriver);
		mysqlBridge.connect();

		Driver sqlServerDriver = new SqlServerDriver();
		mysqlBridge.setDriver(sqlServerDriver);
		mysqlBridge.connect();
	}
}
