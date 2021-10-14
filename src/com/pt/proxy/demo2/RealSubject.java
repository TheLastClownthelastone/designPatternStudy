package com.pt.proxy.demo2;

/**
 * @author nate-pt
 * @date 2021/10/14 11:11
 * @Since 1.8
 * @Description 真实的代理对象
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject类,真实的请求！！");
    }
}
