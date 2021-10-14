package com.pt.strategy;

/**
 * @author nate-pt
 * @date 2021/10/14 15:16
 * @Since 1.8
 * @Description
 */
public class CashReturn extends CashSuper{

    /** 数据a*/
    private double numberA;
    /** 数据b*/
    private double numberB;


    public CashReturn(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    @Override
    public double acceptCash(double money) throws Exception {
        if(money >= numberA){
            if(numberA == 0){
                throw new Exception("输入的满减参数有误！");
            }
            int num = (int) Math.floor(money /numberA);

            return money - (num * numberB);
        }else{
            return money;
        }
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
