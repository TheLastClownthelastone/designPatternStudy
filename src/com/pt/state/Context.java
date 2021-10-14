package com.pt.state;

/**
 * @author nate-pt
 * @date 2021/10/14 13:57
 * @Since 1.8
 * @Description 上下文对象
 */
public class Context {
    /** 储存上下文状态*/
    private State state;

    /**
     * 处理请求，并且切换状态
     */
    public void reqest(){
        state.handle(this);
    }

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态："+state.getClass().getName());
    }
}
