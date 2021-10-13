package com.pt.decorate;

/**
 * @author nate-pt
 * @date 2021/10/13 10:16
 * @Since 1.8
 * @Description T恤类
 */
public class TShirt extends Finery{
    @Override
    public void show() {
        super.show();
        System.out.println("穿T恤");
    }
}
