package com.pt.factory;

/**
 * @author nate-pt
 * @date 2021/10/13 14:23
 * @Since 1.8
 * @Description
 */
public class OperationDiv extends Operation{

    @Override
    public double getResult() throws Exception {
        // TODO Auto-generated method stub
        double res = 0;
        if(super.getNumberB() == 0){
            throw new Exception("除数不能为0");
        }
        res = super.getNumberA() / super.getNumberB() ;
        return res;
    }
}
