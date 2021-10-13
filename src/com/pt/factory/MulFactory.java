package com.pt.factory;

/**
 * @author nate-pt
 * @date 2021/10/13 14:25
 * @Since 1.8
 * @Description 乘法工厂
 */
public class MulFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
