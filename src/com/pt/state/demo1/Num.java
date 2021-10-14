package com.pt.state.demo1;

/**
 * @author nate-pt
 * @date 2021/10/14 14:09
 * @Since 1.8
 * @Description
 */
public abstract class Num {
    private int num;

    public Num(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    /**
     * 方法处理
     * @param num
     */
    public abstract void handle(int num,Context context);
}
