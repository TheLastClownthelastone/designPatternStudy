package com.pt.easyFactory;

/**
 * @author nate-pt
 * @date 2021/10/13 14:01
 * @Since 1.8
 * @Description 两数相除
 */
public class OperationDiv extends Operation{

    @Override
    public double getResult() throws Exception {
        double res = 0;
        if(super.getNumberB() == 0){
            throw new Exception("除数不能为0");
        }
        res = super.getNumberA() / super.getNumberB() ;
        return res;
    }
}
