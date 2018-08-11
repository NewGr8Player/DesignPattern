package com.xavier.p1;


import com.xavier.MainTestCase;
import com.xavier.principle.p1.Phone;
import org.junit.Test;

/**
 * 单一职责原则实例测试
 *
 * @author NewGr8Player
 */
public class SingleResponsibilityPrinciple extends MainTestCase {

    @Test
    public void test() {
        Phone phone = new Phone();
        phone.dail("10086");
        phone.dataTransfer(phone);/* 仅作为演示，这里涉及了·里氏替换原则· */
        phone.hangup();
    }
}
