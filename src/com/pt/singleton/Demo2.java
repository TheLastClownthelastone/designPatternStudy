package com.pt.singleton;

import java.util.concurrent.TimeUnit;

/**
 * @author nate-pt
 * @date 2021/10/14 11:21
 * @Since 1.8
 * @Description 单例模式
 *  懒汉单例模式(线程不安全多线程环境下可能造成new了多个实例)
 */
public class Demo2 {
    private static Demo2 instance = null;

    private Demo2(){}

    public static Demo2 getInstance() {
        try {
            // 为了在多线程环境下看出单例的区别
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (instance == null) {
            instance = new Demo2();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                System.out.println(Demo2.getInstance());
            }).start();
        }
    }
}
