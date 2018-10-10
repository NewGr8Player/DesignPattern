package com.xavier.pattern.structural.s5.p2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理
 *
 * @author NewGr8Player
 */
public class DynamicProxyHandler implements InvocationHandler {

	private Object object;

	public DynamicProxyHandler(final Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("买房前准备");
		Object result = method.invoke(object, args);/* 基于反射 */
		System.out.println("买房后装修");
		return result;
	}
}