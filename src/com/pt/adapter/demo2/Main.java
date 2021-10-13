package com.pt.adapter.demo2;

/**
 * @author nate-pt
 * @date 2021/10/12 11:41
 * @Since 1.8
 * @Description 适配器模式结合抽象类进行使用
 */
public class Main {

    public static void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        Player m = new Guards("麦克格雷迪");
        Player ym = new Translater("姚明");

        ym.attack();
        ym.defense();
        m.defense();
        b.defense();
    }
}
