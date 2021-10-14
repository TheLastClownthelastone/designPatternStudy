package com.pt.state.demo1;

/**
 * @author nate-pt
 * @date 2021/10/14 14:16
 * @Since 1.8
 * @Description
 */
public class SubNum extends Num{
    public SubNum(int num) {
        super(num);
    }

    @Override
    public void handle(int num, Context context) {
        int check = num-15;
        context.setNum(new MulNum(check));
    }
}
