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

    /**
     * 使用瞄准镜瞄准(自己的个性)
     */
    public Number zoom(Number zoom) {
        System.out.println("使用" + zoom + "瞄准...");
        return zoom;
    }
}
