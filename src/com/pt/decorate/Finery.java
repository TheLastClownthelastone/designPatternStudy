package com.pt.decorate;

/**
 * @author nate-pt
 * @date 2021/10/13 9:59
 * @Since 1.8
 * @Description 服饰类
 */
public class Finery extends Person{

    protected Person component;

    /**
     * 装饰方法
     * @param component
     */
    public void decorate(Person component){
        this.component = component;
    }

    /**
     * 重新对应的show 方法，内部装置一装饰人，用来进行行为装饰
     */
    @Override
    public void show() {

        if(component != null){
            component.show();
        }

    }

}
