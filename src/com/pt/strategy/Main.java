package com.pt.strategy;

/**
 * @author nate-pt
 * @date 2021/10/14 14:59
 * @Since 1.8
 * @Description 策略模式
 * 定义不同策略在上下文中，然后获取到一个策略进行计算获取到对应的结果
 */
public class Main {
    public static void main(String[] args) {
        try {
            CashContext cashtext = new CashContext("满减");
            System.out.println(cashtext.contextRes(1000));


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
