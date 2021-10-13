package com.pt.factory;

/**
 * @author nate-pt
 * @date 2021/10/13 14:24
 * @Since 1.8
 * @Description
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        // TODO Auto-generated method stub
        double res = 0;
        res = super.getNumberA() - super.getNumberB() ;
        return res;
    }

}
