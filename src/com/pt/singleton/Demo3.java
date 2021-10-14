package com.pt.singleton;

import sun.security.jca.GetInstance;

import java.util.concurrent.TimeUnit;

/**
 * @author nate-pt
 * @date 2021/10/14 11:24
 * @Since 1.8
 * @Description 单例模式
 * 线程安全的懒汉模式(synchronized关键字处理)
 */
public class Demo3 {
    private static Demo3 instance = null;

    private Demo3(){}

    /**
     * 加上synchronized关键字 或者使用lock锁 可以解决改问题
     * @return
     */
    public synchronized static Demo3 getInstance() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (instance == null) {
            instance = new Demo3();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                System.out.println(Demo3.getInstance());
            }).start();
        }
    }
}
