package com.pt.dutyChain;

import java.util.Arrays;
import java.util.List;

/**
 * @author nate-pt
 * @date 2021/10/13 10:29
 * @Since 1.8
 * @Description 责任链模式
 */
public class Main {

    public static void main(String[] args) {
        Handler handler = new HandlerA();
        Handler handler1 = new HandlerB();
        Handler handler2 = new HandlerC();
        Handler handler3 = new HandlerD();

        handler.setHandler(handler1);
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        List<Integer> requests = Arrays.asList(2, 5, 14, 17, 8, 20, 21, 11, 25, 0, 32, 4, 0, 2, 14);

        requests.forEach(integer -> handler.handlerRequest(integer));
    }
}
