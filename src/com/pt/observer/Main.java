package com.pt.observer;

/**
 * @author nate-pt
 * @date 2021/10/14 10:21
 * @Since 1.8
 * @Description 观察者模式
 * 通知者中有个管理观察者的集合，可以增加通知者也可删除对应的通知者，并且每一个通知者都有一个更新最新消息的方法
 *  通知通过循环调用每一个观察者的更新方法实现发布功能，每一个观察者中同样具有同一个观察对象
 *
 *  在一对多的模式下，观察者模式比较适用
 */
public class Main {
    public static void main(String[] args) {
        // 创建通知者对象
        Subject subject = new ConcreteSubject();
        // 注册对应的观察者
        subject.addSubject(new ConcreteObserver("A",subject));
        subject.addSubject(new ConcreteObserver("B",subject));
        subject.addSubject(new ConcreteObserver("C",subject));

        // 通知者发送最新的通知
        subject.send("zuixin");
        // 观察者们更新最新状态
        subject.notifyObserver();
    }
}
