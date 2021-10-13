package com.pt.factory;

/**
 * @author nate-pt
 * @date 2021/10/13 14:24
 * @Since 1.8
 * @Description 减法工厂
 */
public class DivFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
