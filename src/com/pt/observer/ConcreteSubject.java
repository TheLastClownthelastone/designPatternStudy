package com.pt.observer;

/**
 * @author nate-pt
 * @date 2021/10/14 10:41
 * @Since 1.8
 * @Description 具体通知者
 */
public class ConcreteSubject extends Subject{

    @Override
    public void send(String msg) {
        setMsg(msg);
    }
}
