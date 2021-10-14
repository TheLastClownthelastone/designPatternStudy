package com.pt.state;

/**
 * @author nate-pt
 * @date 2021/10/14 13:57
 * @Since 1.8
 * @Description 状态的抽象类
 */
public abstract class State {
    /**
     * 切换状态
     * @param context
     */
    public abstract void handle(Context context);
}
