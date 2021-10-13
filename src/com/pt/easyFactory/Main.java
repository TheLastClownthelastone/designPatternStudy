package com.pt.easyFactory;

/**
 * @author nate-pt
 * @date 2021/10/13 13:54
 * @Since 1.8
 * @Description 简单工程模式
 * 将行为进行抽象，通过工厂类中switch 获取对应的实现，执行对应的抽象方法
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Operation operation = OperationFactory.createOperation("*");
        operation.setNumberA(3);
        operation.setNumberB(4);
        System.out.println(operation.getResult());
    }
}
