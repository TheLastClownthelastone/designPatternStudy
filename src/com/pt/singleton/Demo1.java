package com.pt.singleton;

/**
 * @author nate-pt
 * @date 2021/10/14 11:19
 * @Since 1.8
 * @Description 单例模式
 * 恶汉单例模式
 */
public class Demo1 {
    private static Demo1 instance = new Demo1();
    private Demo1(){

    }

    public static Demo1 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Demo1.getInstance());
    }
}
