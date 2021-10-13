package com.pt.decorate;

/**
 * @author nate-pt
 * @date 2021/10/13 10:18
 * @Since 1.8
 * @Description
 */
public class Shoes extends Finery{

    @Override
    public void show() {
        super.show();
        System.out.println("穿鞋子");
    }
}
