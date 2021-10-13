package com.pt.flyweight;

/**
 * @author nate-pt
 * @date 2021/10/13 14:41
 * @Since 1.8
 * @Description
 */
public class ConcreteFlyweight extends Flyweight{
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体flyweight："+extrinsicstate);
    }
}
