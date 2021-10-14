package com.pt.singleton;

import java.util.concurrent.TimeUnit;

/**
 * @author nate-pt
 * @date 2021/10/14 11:44
 * @Since 1.8
 * @Description 使用静态内部类实现单例模式
 */
public class Demo5 {

    private Demo5(){}

    private static class Demo5SingletonHolder{
        private static Demo5 instance = new Demo5();
    }

    public static Demo5 getInstance(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Demo5SingletonHolder.instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                System.out.println(Demo5.getInstance());
            }).start();
        }
    }
}
