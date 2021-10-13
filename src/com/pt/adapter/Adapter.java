package com.pt.adapter;

/**
 * @author nate-pt
 * @date 2021/10/12 11:34
 * @Since 1.8
 * @Description 适配器
 * 这类适配器要继承目标类，并且在该类中必须要有实现类的对象
 */
public class Adapter extends Target{

    private MySelf mySelf = new MySelf();

    @Override
    public void request() {
        mySelf.requestHand();
    }
}
