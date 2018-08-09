package com.xavier.principle.p2.gun;

import com.xavier.principle.p2.abs.AbstractGun;

/**
 * 手枪类
 * <br />
 * 实现了
 * <ul>
 * <li>抽象枪支类 {@link com.xavier.principle.p2.abs.AbstractGun}</li>
 * </ul>
 */
public class Pistol extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("Bui...Bui...Bui...");
    }
}
