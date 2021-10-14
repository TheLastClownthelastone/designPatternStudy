package com.pt.proxy.demo1;

/**
 * @author nate-pt
 * @date 2021/10/14 11:03
 * @Since 1.8
 * @Description 代理模式
 * 没有进行代理模式的代码
 */
public class Main {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl("娇娇");

        //没有代理，卓佳怡 不认识 娇娇的 此处有问题的
        Pursuit zhuojiayi = new Pursuit(mm);

        zhuojiayi.giveDolls();
        zhuojiayi.giveFlower();
    }
}
