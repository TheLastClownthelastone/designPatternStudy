package com.pt.dutyChain;

/**
 * @author nate-pt
 * @date 2021/10/13 10:57
 * @Since 1.8
 * @Description
 */
public class HandlerA extends Handler{
    @Override
    public void handlerRequest(int request) {
        if (request>0 && request<=10) {
            System.out.println(getClass().getName()+"：进行处理了："+request);
        }else {
            // 交给上一个节点进行处理
            if (super.handler!=null) {
                super.handler.handlerRequest(request);
            }
        }
    }
}
