package com.pt.command;

/**
 * @author nate-pt
 * @date 2021/10/12 15:47
 * @Since 1.8
 * @Description 命令模式
 * 将所有指令包装在服务员对象中，调用服务员执行命令
 */
public class Main {

    public static void main(String[] args) {

        Barbecuer boy = new Barbecuer();

        Command com1= new BakeMuttonCommand(boy);
        Command com2= new BakeMuttonCommand(boy);
        Command com3= new BakeMuttonCommand(boy);
        Command com4= new BakeChickenCommand(boy);

        Waiter girl = new Waiter();

        girl.setOrder(com1);
        girl.setOrder(com2);
        girl.setOrder(com3);
        girl.setOrder(com4);
        girl.cancelOrder(com4);


        girl.notifyInfo();
    }

}
