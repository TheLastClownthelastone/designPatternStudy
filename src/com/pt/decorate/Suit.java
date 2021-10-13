package com.pt.decorate;

/**
 * @author nate-pt
 * @date 2021/10/13 10:17
 * @Since 1.8
 * @Description 西装类
 */
public class Suit extends Finery{
    @Override
    public void show() {
        super.show();
        System.out.println("穿西装");
    }
}
