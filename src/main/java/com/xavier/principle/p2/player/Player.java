package com.xavier.principle.p2.player;

import com.xavier.principle.p2.abs.AbstractGun;
import lombok.Setter;

/**
 * 玩家类
 * 此处也可以抽象为抽象类
 * 然后实现，进而实现多角色游戏
 * 此处用来演示组合关系，不再细分
 *
 * @author NewGr8Player
 */
@Setter
public class Player {

    /**
     * 玩家可以持有武器（此处限制为一把）
     */
    private AbstractGun gun;

    /**
     * 作战
     */
    public void battle() {
        gun.shoot();
    }
}
