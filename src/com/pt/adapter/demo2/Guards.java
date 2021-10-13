package com.pt.adapter.demo2;

/**
 * @author nate-pt
 * @date 2021/10/12 11:47
 * @Since 1.8
 * @Description 后卫
 */
public class Guards extends Player{
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫:"+name+",进攻！！！");
    }

    @Override
    public void defense() {
        System.out.println("后卫:"+name+",防守！！！");
    }
}
