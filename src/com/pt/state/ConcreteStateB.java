package com.pt.state;

/**
 * @author nate-pt
 * @date 2021/10/14 14:01
 * @Since 1.8
 * @Description
 */
public class ConcreteStateB extends State{
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
