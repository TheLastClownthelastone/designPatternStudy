package com.pt.strategy;

/**
 * @author nate-pt
 * @date 2021/10/14 15:15
 * @Since 1.8
 * @Description 算法父类
 */
public abstract class CashSuper {

    /**
     * 全局对应算法
     * @param money
     * @return
     * @throws Exception
     */
    public abstract double acceptCash(double money) throws Exception;
}
