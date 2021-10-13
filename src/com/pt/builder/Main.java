package com.pt.builder;

/**
 * @author nate-pt
 * @date 2021/10/12 14:50
 * @Since 1.8
 * @Description 构建模式
 *
 * 将目标类中特定属性的实现可以通过构造器进行创建，构建器通用抽象
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        Builder a = new ConcreteBuilderA();
        Builder b = new ConcreteBuilderB();

        director.construct(a);
        Product result = a.getResult();
        result.showParts();
        director.construct(b);
        Product result1 = b.getResult();
        result1.showParts();
    }
}
