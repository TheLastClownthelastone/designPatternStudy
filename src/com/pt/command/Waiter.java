package com.pt.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nate-pt
 * @date 2021/10/12 15:58
 * @Since 1.8
 * @Description 服务员
 */
public class Waiter {

    /**
     * 命令集合
     */
    private List<Command> list = new ArrayList<>();

    /**
     * 设置订单
     * @param command
     */
    public void setOrder(Command command){
        if ("鸡翅".equals(command.toString())) {
            System.out.println("服务员：鸡翅没有了,请点别的烧烤！");
        }else {
            list.add(command);
            System.out.println("服务员：增加订单："+command.toString());
        }
    }

    /**
     * 取消订单
     * @param command
     */
    public void cancelOrder(Command command){
        list.remove(command);
        System.out.println("服务员：取消订单："+command.toString());
    }

    /**
     * 服务员通知操作
     */
    public void notifyInfo(){
        list.forEach(command -> command.executeCommand());
    }
}
