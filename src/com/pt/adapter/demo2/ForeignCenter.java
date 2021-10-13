package com.pt.adapter.demo2;

/**
 * @author nate-pt
 * @date 2021/10/12 11:51
 * @Since 1.8
 * @Description
 */
public class ForeignCenter {

    private String name;


    public void jinGong(){
        System.out.println("中锋:"+name+",进攻！！！");
    }

    public void fangShou(){
        System.out.println("中锋:"+name+",防守！！！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
