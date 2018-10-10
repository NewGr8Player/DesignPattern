package com.xavier.pattern.structural.s6;

import com.xavier.pattern.structural.s6.abs.Driver;
import lombok.Getter;
import lombok.Setter;

/**
 * 桥接抽象类
 *
 * @author NewGr8Player
 */
@Getter
@Setter
public abstract class Bridge {

	protected Driver driver;

	/**
	 * 连接数据库
	 */
	public abstract void connect();
}