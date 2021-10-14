package com.pt.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nate-pt
 * @date 2021/10/14 10:25
 * @Since 1.8
 * @Description 通知者
 */
public abstract class Subject {
    /** 注册观察者对象集合*/
    private List<Observer> observers = new ArrayList<>();

    /** 通知消息*/
    protected String msg;

    /**
     * 注册新的观察者
     * @param observer
     */
    public void addSubject(Observer observer){
        observers.add(observer);
    }

    /**
     * 移除对应的观察者
     * @param observer
     */
    public void remove(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知所有注册的观察者
     */
    public void notifyObserver(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 推送最新的消息
     * @param msg
     */
    public abstract void send(String msg);
}
