package com.pt.proxy.demo2;

/**
 * @author nate-pt
 * @date 2021/10/14 11:10
 * @Since 1.8
 * @Description 代理类
 */
public class Proxy implements Subject{

    private RealSubject realSubject;
    @Override
    public void request() {
        System.out.println("开始进行代理");
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
