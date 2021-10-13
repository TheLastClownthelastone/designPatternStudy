package com.pt.dutyChain;

/**
 * @author nate-pt
 * @date 2021/10/13 10:48
 * @Since 1.8
 * @Description 设置责任链的节点
 */
public abstract class Handler {
    /**
     * 用于每一个节点进行绑定
     */
    protected  Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     * 处理请求
     * @param request
     */
    public abstract void handlerRequest(int request);
}
