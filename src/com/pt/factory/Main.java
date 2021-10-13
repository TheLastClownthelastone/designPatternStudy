package com.pt.factory;

/**
 * @author nate-pt
 * @date 2021/10/13 14:19
 * @Since 1.8
 * @Description 工厂模式
 *  结合之前两数计算的demo 对应简单工厂模式
 *  工厂模式创建实例不做判断，取决怎么new对应类型的实例化工厂进行对象创建
 */
public class Main {
    public static void main(String[] args) throws Exception {

        // 通过new 对应的工厂获取到对应的实例对象
        IFactory ifactory= new AddFactory();

        Operation oper = ifactory.createOperation();

        oper.setNumberA(100);
        oper.setNumberB(101);

        System.out.println(oper.getResult());
    }
}
