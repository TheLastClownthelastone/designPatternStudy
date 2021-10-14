package com.pt.proxy.demo2;

/**
 * @author nate-pt
 * @date 2021/10/14 11:09
 * @Since 1.8
 * @Description 需要被代理对象的接口
 */
public interface Subject {
    /**
     * 被代理这发出的请求
     */
    void  request();
}
