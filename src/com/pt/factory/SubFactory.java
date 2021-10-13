package com.pt.factory;

/**
 * @author nate-pt
 * @date 2021/10/13 14:26
 * @Since 1.8
 * @Description 减法工厂
 */
public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
