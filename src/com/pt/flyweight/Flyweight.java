package com.pt.flyweight;

/**
 * @author nate-pt
 * @date 2021/10/13 14:40
 * @Since 1.8
 * @Description 享元的父类
 */
public abstract class Flyweight {
    /**
     * 方法享元
     * @param extrinsicstate
     */
    public abstract void operation(int extrinsicstate);
}
