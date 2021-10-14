package com.pt.proxy.demo1;

/**
 * @author nate-pt
 * @date 2021/10/14 11:04
 * @Since 1.8
 * @Description
 */
public class Pursuit {
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        // TODO Auto-generated constructor stub
        this.mm = mm;
    }

    public void giveDolls(){
        System.out.println(mm.getName()+",送你的洋娃娃");
    }
    public void giveFlower(){
        System.out.println(mm.getName()+",送你的鲜花");
    }
}
