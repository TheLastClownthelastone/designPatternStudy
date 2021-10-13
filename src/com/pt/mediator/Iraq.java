package com.pt.mediator;

/**
 * @author nate-pt
 * @date 2021/10/13 16:40
 * @Since 1.8
 * @Description 伊拉克
 */
public class Iraq extends Country{

    public Iraq(UniteNations uniteNations) {
        super(uniteNations);
    }

    public void notifyInfo(String message){
        System.out.println("Iraq得到消息："+message);
    }

    public void send(String message){
        super.uniteNations.declare(message, this);
    }
}
