package com.pt.mediator;

/**
 * @author nate-pt
 * @date 2021/10/13 16:41
 * @Since 1.8
 * @Description 美国
 */
public class USA extends Country{
    public USA(UniteNations uniteNations) {
        super(uniteNations);
    }

    public void notifyInfo(String message){
        System.out.println("USA得到消息："+message);
    }

    public void send(String message){
        super.uniteNations.declare(message, this);
    }
}
