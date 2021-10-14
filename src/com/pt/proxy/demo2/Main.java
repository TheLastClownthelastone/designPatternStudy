package com.pt.proxy.demo2;

/**
 * @author nate-pt
 * @date 2021/10/14 11:13
 * @Since 1.8
 * @Description
 *  代理模式被代理者和代理者统一实现一个接口
 *  并且代理的实例中含有被代理者对象
 */
public class Main {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();

    }

}
