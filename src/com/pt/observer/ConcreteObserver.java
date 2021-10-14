package com.pt.observer;

/**
 * @author nate-pt
 * @date 2021/10/14 10:33
 * @Since 1.8
 * @Description 具体的观察者
 */
public class ConcreteObserver extends Observer{
    public ConcreteObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println("观察者:"+name+"收到最新的消息为：:"+subject.getMsg());
    }
}
