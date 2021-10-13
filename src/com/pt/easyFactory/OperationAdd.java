package com.pt.easyFactory;

/**
 * @author nate-pt
 * @date 2021/10/13 14:00
 * @Since 1.8
 * @Description 两数相加
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        double res = 0;
        res = super.getNumberA() + super.getNumberB() ;
        return res;
    }
}
