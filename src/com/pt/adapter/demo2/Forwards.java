package com.pt.adapter.demo2;

/**
 * @author nate-pt
 * @date 2021/10/12 11:46
 * @Since 1.8
 * @Description 前锋
 */
public class Forwards extends Player{
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋:"+name+",进攻！！！");
    }

    @Override
    public void defense() {
        System.out.println("前锋:"+name+",防守！！！");
    }
}
