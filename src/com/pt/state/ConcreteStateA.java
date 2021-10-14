package com.pt.state;

/**
 * @author nate-pt
 * @date 2021/10/14 13:59
 * @Since 1.8
 * @Description A状态
 */
public class ConcreteStateA extends State{
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
