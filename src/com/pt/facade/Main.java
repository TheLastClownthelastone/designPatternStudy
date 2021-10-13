package com.pt.facade;

/**
 * @author nate-pt
 * @date 2021/10/13 14:11
 * @Since 1.8
 * @Description 外观设计模式
 * 将多种抽象的实现，进行汇集到统一api中进行执行方便之后系统横向扩张
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();
    }
}
