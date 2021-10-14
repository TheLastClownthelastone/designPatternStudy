package com.pt.strategy;

/**
 * @author nate-pt
 * @date 2021/10/14 15:14
 * @Since 1.8
 * @Description 简单工厂模式和策略模式整合上下文
 */
public class CashContext {

    private CashSuper cashsuper = null;

    public CashContext(String  str) {
        switch (str) {
            case "正常":
                cashsuper = new CashNormal();
                break;
            case "满减":
                cashsuper = new CashReturn(300,100);
                break;
            case "折扣":
                cashsuper = new CashRebate(0.8);
                break;
            default:
                cashsuper = new CashNormal();
                System.out.println("走到默认值了");
                break;
        }

    }

    public double contextRes(double money) throws Exception{

        return cashsuper.acceptCash(money);
    }

}
