package com.pt.strategy;

/**
 * @author nate-pt
 * @date 2021/10/14 15:30
 * @Since 1.8
 * @Description
 */
public class CashRebate extends CashSuper{
    private double rate;

    public CashRebate(double rate) {
        this.rate = rate;
    }

    @Override
    public double acceptCash(double money) {
        // TODO Auto-generated method stub
        return money * rate;
    }


    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
