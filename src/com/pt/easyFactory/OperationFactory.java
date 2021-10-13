package com.pt.easyFactory;

/**
 * @author nate-pt
 * @date 2021/10/13 13:56
 * @Since 1.8
 * @Description 计算公式工厂
 */
public class OperationFactory {

    /**
     * 获取对应的算法
     * @param operation
     * @return
     */
    public static Operation createOperation(String operation){
        Operation oper = null;
        switch (operation) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}
