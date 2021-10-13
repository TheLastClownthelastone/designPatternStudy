package com.pt.command;

/**
 * @author nate-pt
 * @date 2021/10/12 15:57
 * @Since 1.8
 * @Description 烤鸡翅的命令
 */
public class BakeChickenCommand extends Command{

    String str = "鸡翅";

    public BakeChickenCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeChicken();
    }

    @Override
    public String toString() {
        return str;
    }
}
