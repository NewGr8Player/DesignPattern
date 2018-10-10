package com.xavier.pattern.structural.s5;

import com.xavier.MainTestCase;
import com.xavier.pattern.structural.s5.p1.BuyHouseProxy;
import com.xavier.pattern.structural.s5.p1.abs.BuyHouse;
import com.xavier.pattern.structural.s5.p1.impl.BuyHouseImpl;
import com.xavier.pattern.structural.s5.p2.DynamicProxyHandler;
import com.xavier.pattern.structural.s5.p3.CglibProxy;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * 代理模式测试
 *
 * @author NewGr8Player
 */
public class ProxyPatternTest extends MainTestCase {

	/**
	 * 静态代理
	 */
	@Test
	public void staticProxyTest() {
		BuyHouse buyHouse = new BuyHouseImpl();
		buyHouse.buyHosue();
		BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
		buyHouseProxy.buyHosue();
	}

	/**
	 * JDK动态代理
	 */
	@Test
	public void dynamicProxyTest() {
		BuyHouse buyHouse = new BuyHouseImpl();
		BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new
				Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
		proxyBuyHouse.buyHosue();
	}

	/**
	 * JDK动态代理
	 */
	@Test
	public void cglibProxyTest () {
		BuyHouse buyHouse = new BuyHouseImpl();
		CglibProxy cglibProxy = new CglibProxy();
		BuyHouseImpl buyHouseCglibProxy = (BuyHouseImpl) cglibProxy.getInstance(buyHouse);
		buyHouseCglibProxy.buyHosue();
	}


}
