package com.pt.adapter.demo2;

/**
 * @author nate-pt
 * @date 2021/10/12 11:41
 * @Since 1.8
 * @Description 抽象一个运动员的类
 * 将运动员的行为进行抽象
 */
public abstract class Player {

    /** 运动员的名称*/
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    /**
     * 进攻
     */
    public abstract void attack();

    /**
     * 防守
     * **/
    public abstract void defense();


}
