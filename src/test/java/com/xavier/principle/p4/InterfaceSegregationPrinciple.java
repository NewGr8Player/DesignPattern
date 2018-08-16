package com.xavier.principle.p4;

import com.xavier.MainTestCase;
import com.xavier.principle.p4.abs.Bird;
import com.xavier.principle.p4.abs.Human;
import com.xavier.principle.p4.impl.Chinese;
import com.xavier.principle.p4.impl.Sparrow;
import org.junit.Test;

/**
 * 依赖倒置原则测试实例
 *
 * @author NewGr8player
 */
public class InterfaceSegregationPrinciple extends MainTestCase {

    @Test
    public void test(){
        Human zhangsan = new Chinese();

        zhangsan.walk();
        zhangsan.eat();
        zhangsan.sleep();

        Bird maque = new Sparrow();

        maque.fly();
        maque.eat();
        maque.sleep();
    }
}
