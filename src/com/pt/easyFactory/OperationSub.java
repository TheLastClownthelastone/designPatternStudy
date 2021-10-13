package com.pt.easyFactory;

/**
 * @author nate-pt
 * @date 2021/10/13 14:02
 * @Since 1.8
 * @Description 两数相减
 */
public class OperationSub extends Operation{
    @Override
    public double getResult() throws Exception {
        double res = 0;
        res = super.getNumberA() - super.getNumberB() ;
        return res;
    }
}
