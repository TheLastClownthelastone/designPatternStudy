package com.pt.decorate;

/**
 * @author nate-pt
 * @date 2021/10/13 9:54
 * @Since 1.8
 * @Description 装饰模式
 * 在装饰的类中添加进行抽象，在对应的实现了中有该装饰类，每一个装饰类中在重写抽象行为的时候
 * 先调用super对应的方法
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("pt");
        System.out.println("第一次着装：");
        Suit suit = new Suit();
        Shoes shoes = new Shoes();
        suit.decorate(person);
        shoes.decorate(suit);
        shoes.show();

        System.out.println("第二次着装：");
        TShirt tShirt = new TShirt();
        Shoes shoes1 = new Shoes();
        tShirt.decorate(person);
        shoes1.decorate(tShirt);
        shoes1.show();
    }
}
