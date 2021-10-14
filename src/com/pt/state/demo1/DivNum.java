package com.pt.state.demo1;

/**
 * @author nate-pt
 * @date 2021/10/14 14:21
 * @Since 1.8
 * @Description
 */
public class DivNum extends Num{
    public DivNum(int num) {
        super(num);
    }

    @Override
    public void handle(int num, Context context) {
        int check = num/2;
        context.setNum(new AddNum(check));
    }
}
