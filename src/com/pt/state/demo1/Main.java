package com.pt.state.demo1;

/**
 * @author nate-pt
 * @date 2021/10/14 14:22
 * @Since 1.8
 * @Description
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context(new AddNum(10));
        for (int i = 0; i < 5; i++) {
            context.staticHandler();
        }
    }
}
