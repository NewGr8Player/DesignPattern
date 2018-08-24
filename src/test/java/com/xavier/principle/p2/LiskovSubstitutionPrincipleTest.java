package com.xavier.principle.p2;

import com.xavier.MainTestCase;
import com.xavier.principle.p2.gun.GatlinGun;
import com.xavier.principle.p2.gun.Pistol;
import com.xavier.principle.p2.gun.Rifle;
import com.xavier.principle.p2.gun.Snipper;
import com.xavier.principle.p2.player.Player;
import org.junit.Test;

/**
 * 里氏替换原则实例测试
 *
 * @author NewGr8player
 */
public class LiskovSubstitutionPrincipleTest extends MainTestCase {

    /**
     * 使用父类作为参数
     * 父类出现的地方子类都能完美适应
     */
    @Test
    public void test() {
        Player player = new Player();
        player.setGun(new Pistol());
        player.battle();
        /* 切换枪支实例即可视为更换武器 */
        player.setGun(new Rifle());
        player.battle();
        /* 再次切换 */
        player.setGun(new GatlinGun());
        player.battle();
    }

    @Test
    public void text02() {
        Snipper snipper = new Snipper();
        snipper.shoot();
        /* 尝试调用 */
        Number number = snipper.zoom(new Integer(10));
        System.out.println(number);
    }
}
