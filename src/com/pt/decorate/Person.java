package com.pt.decorate;

/**
 * @author nate-pt
 * @date 2021/10/13 9:55
 * @Since 1.8
 * @Description 装饰人
 */
public class Person {
    /**
     * 修饰人名称
     */
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(){}

    /**
     * 展示
     */
    public void show(){
        System.out.println(name+"打扮成");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
