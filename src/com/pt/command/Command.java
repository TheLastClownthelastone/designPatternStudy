package com.pt.command;

/**
 * @author nate-pt
 * @date 2021/10/12 15:48
 * @Since 1.8
 * @Description
 */
public abstract class Command {

    /**
     * 命令人
     */
    protected  Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    /**
     * 执行命令
     */
    public abstract void executeCommand();
}
