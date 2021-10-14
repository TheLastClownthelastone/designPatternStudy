package com.pt.state.demo1;

/**
 * @author nate-pt
 * @date 2021/10/14 14:18
 * @Since 1.8
 * @Description
 */
public class MulNum extends Num{
    public MulNum(int num) {
        super(num);
    }

    @Override
    public void handle(int num, Context context) {
        int check = num*2;
        context.setNum(new DivNum(check));
    }
}
