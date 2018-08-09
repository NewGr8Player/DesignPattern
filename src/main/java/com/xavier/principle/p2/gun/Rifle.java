package com.xavier.principle.p2.gun;

import com.xavier.principle.p2.abs.AbstractGun;

/**
 * 来复枪
 * <br />
 * 实现了
 * <ul>
 * <li>抽象枪支类 {@link com.xavier.principle.p2.abs.AbstractGun}</li>
 * </ul>
 */
public class Rifle extends AbstractGun {

    @Override
    public void shoot() {
        System.out.println("Tu..tu..tu...");
    }
}
