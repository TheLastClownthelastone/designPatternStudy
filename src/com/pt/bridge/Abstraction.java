package com.pt.bridge;

/**
 * @author nate-pt
 * @date 2021/10/12 14:06
 * @Since 1.8
 * @Description 桥接类
 */
public class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void run(){
        implementor.operation();
    }
}
