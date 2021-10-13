package com.pt.facade;

/**
 * @author nate-pt
 * @date 2021/10/13 14:12
 * @Since 1.8
 * @Description 外观类
 *  在外观类中加上外部api 具体实现的方法类对象
 */
public class Facade {
    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;
    private SubSystemFour four;

    public Facade() {
        // TODO Auto-generated constructor stub
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }


    public void methodA(){
        System.out.println("方法组A");
        one.methodOne();
        three.methodThree();
    }

    public void methodB(){
        System.out.println("方法组B");
        two.methodTwo();
        four.methodFour();
    }
}
