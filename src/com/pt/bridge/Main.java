package com.pt.bridge;

/**
 * @author nate-pt
 * @date 2021/10/12 14:05
 * @Since 1.8
 * @Description 桥接模式
 * 在桥接类中定义行为的具体抽象
 * 在具体方法中执行抽象的具体方法
 */
public class Main {

    public static void main(String[] args) {
        Abstraction ab = new Abstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.run();

        ab.setImplementor(new ConcreteImplementorB());
        ab.run();
    }
}
