package com.pt.flyweight;

/**
 * @author nate-pt
 * @date 2021/10/13 14:36
 * @Since 1.8
 * @Description 享元模式
 * 一般享元模式结合工厂模式一起使用减少new对象造成的内存的开销
 */
public class Main {

    public static void main(String[] args) {
        int num = 22;

        FlyweightFactory ff = new FlyweightFactory();

        Flyweight fx = ff.getFlyWeight("X");
        fx.operation(--num);

        Flyweight fy = ff.getFlyWeight("Y");
        fy.operation(--num);

        Flyweight fz = ff.getFlyWeight("Z");
        fz.operation(--num);

        Flyweight dd = ff.getFlyWeight("DD");
        dd.operation(--num);

        UnSharedConcreteFlyweight uf = new UnSharedConcreteFlyweight();
        uf.operation(--num);
    }
}
