package com.pt.easyFactory;

/**
 * @author nate-pt
 * @date 2021/10/13 13:57
 * @Since 1.8
 * @Description 两数计算对象
 */
public class Operation {

    /** 参与计算的第一个数*/
    private double numberA;
    /** 参与计算的第二个数*/
    private double numberB;

    /**
     * 获取计算结果
     * @return
     */
    public double getResult() throws Exception {
        double res = 0;
        return res;
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
