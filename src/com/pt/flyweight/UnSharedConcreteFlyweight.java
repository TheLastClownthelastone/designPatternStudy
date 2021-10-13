package com.pt.flyweight;

/**
 * @author nate-pt
 * @date 2021/10/13 14:44
 * @Since 1.8
 * @Description 不享元的对象
 */
public class UnSharedConcreteFlyweight extends Flyweight{
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享具体的flyweight："+extrinsicstate);
    }
}
