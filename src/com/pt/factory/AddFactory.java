package com.pt.factory;

/**
 * @author nate-pt
 * @date 2021/10/13 14:25
 * @Since 1.8
 * @Description 加法工厂
 */
public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
