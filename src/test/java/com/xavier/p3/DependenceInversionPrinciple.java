package com.xavier.p3;

import com.xavier.MainTestCase;
import com.xavier.principle.p3.abs.Car;
import com.xavier.principle.p3.impl.AIDriver;
import com.xavier.principle.p3.impl.BMW;
import com.xavier.principle.p3.impl.Benz;
import com.xavier.principle.p3.impl.Human;
import org.junit.Before;
import org.junit.Test;

/**
 * 依赖倒置原则测试实例
 *
 * @author NewGr8player
 */
public class DependenceInversionPrinciple extends MainTestCase {

    Car benz;
    Car bmw;

    @Before
    public void init() {
        benz = new Benz();
        bmw = new BMW();
    }

    /**
     * 张三开车
     */
    @Test
    public void test() {
        Human zhangsan = new Human("张三");

        zhangsan.drive(benz);

        zhangsan.drive(bmw);
    }

    /**
     * 小爱同学(AI)开车
     */
    @Test
    public void test02() {
        AIDriver xiaoai = new AIDriver();

        xiaoai.drive(benz);

        xiaoai.drive(bmw);
    }
}
