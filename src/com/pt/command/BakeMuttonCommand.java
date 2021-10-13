package com.pt.command;

/**
 * @author nate-pt
 * @date 2021/10/12 15:55
 * @Since 1.8
 * @escription 烤羊肉串的命令
 */
public class BakeMuttonCommand extends Command{

    String str = "羊肉串";

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeMutton();
    }

    @Override
    public String toString() {
        return str;
    }
}
