package com.pt.singleton;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nate-pt
 * @date 2021/10/14 11:33
 * @Since 1.8
 * @Description 单例模式
 * 线程安全的懒汉模式（lock锁处理）
 */
public class Demo4 {
    private static Demo4 instance = null;

    private static Lock lock = new ReentrantLock();


    private Demo4(){}

    public static Demo4 getInstance() {
        lock.lock();
        try {
            //TimeUnit.SECONDS.sleep(2);
            if (instance ==null) {
                instance = new Demo4();
            }
            return instance;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        return null;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                System.out.println(Demo4.getInstance());
            }).start();
        }
    }
}
