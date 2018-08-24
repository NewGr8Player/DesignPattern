package com.xavier.principle.p2.gun;

/**
 * 狙击步枪
 */
public class Snipper extends Rifle {

    /**
     * 放大前置条件范围
     *
     * @param zoom
     * @return
     */
    public Number zoom(Object zoom) {
        return null;
    }

    /**
     * 重写父类方法并缩小返回值范围
     *
     * @param zoom
     * @return
     */
    @Override
    public Number zoom(Number zoom) {
        System.out.println("覆盖:使用倍" + zoom + "镜瞄准");
        return new Integer(8);
    }
}
