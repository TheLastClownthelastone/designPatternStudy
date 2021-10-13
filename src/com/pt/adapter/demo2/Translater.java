package com.pt.adapter.demo2;

/**
 * @author nate-pt
 * @date 2021/10/12 11:50
 * @Since 1.8
 * @Description
 */
public class Translater extends Player{

    private ForeignCenter fc = new ForeignCenter();

    public Translater(String name) {
        super(name);
        fc.setName(name);
    }

    @Override
    public void attack() {
        fc.jinGong();
    }

    @Override
    public void defense() {
        fc.fangShou();
    }
}
