package com.pt.state.demo1;

/**
 * @author nate-pt
 * @date 2021/10/14 14:07
 * @Since 1.8
 * @Description 全局上下文对象
 */
public class Context {
    private Num num;


    public void staticHandler(){
        System.out.println("当前计算类："+num.getClass().getName()+" num值为："+num.getNum());
        num.handle(num.getNum(),this);
    }

    public Context(Num num) {
        this.num = num;
    }

    public Num getNum() {
        return num;
    }

    public void setNum(Num num) {
        this.num = num;
    }
}
