package com.pt.adapter.demo2;

/**
 * @author nate-pt
 * @date 2021/10/12 11:45
 * @Since 1.8
 * @Description 中锋
 */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋:"+name+",进攻！！！");
    }

    @Override
    public void defense() {
        System.out.println("中锋:"+name+",防守！！！");
    }
}
