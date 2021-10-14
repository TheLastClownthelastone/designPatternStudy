package com.pt.state;

/**
 * @author nate-pt
 * @date 2021/10/14 13:55
 * @Since 1.8
 * @Description 状态模式
 * 利用上下文对象记录状态
 * 两个状态或者多种状态进行切换的时候用到
 */
public class Main {
    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateB());

        c.reqest();
        c.reqest();
        c.reqest();
        c.reqest();
        c.reqest();
    }
}
