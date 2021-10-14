package com.pt.state.demo1;

/**
 * @author nate-pt
 * @date 2021/10/14 14:14
 * @Since 1.8
 * @Description
 */
public class AddNum extends Num{
    public AddNum(int num) {
        super(num);
    }

    @Override
    public void handle(int num, Context context) {
        int check = num+10;
        context.setNum(new SubNum(check));
    }
}
