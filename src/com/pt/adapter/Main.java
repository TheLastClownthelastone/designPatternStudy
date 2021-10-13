package com.pt.adapter;

/**
 * @author nate-pt
 * @date 2021/10/12 11:32
 * @Since 1.8
 * @Description 适配器模式，在一个类中的方法中换成其他跟这类没有任务关系的进行实现
 *
 * 通过适配器继承目标类，并且重写目标类中的方法采用适配类的方法进行重写
 */
public class Main {


    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
