package com.pt.observer;

/**
 * @author nate-pt
 * @date 2021/10/14 10:26
 * @Since 1.8
 * @Description 观察者
 */
public abstract class Observer {
    /** 名称*/
    protected  String name;
    /** 通知者*/
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    /**
     * 观察者更新状态
     */
    public abstract  void update();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

}
