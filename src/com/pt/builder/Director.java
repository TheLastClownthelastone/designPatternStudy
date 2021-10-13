package com.pt.builder;

/**
 * @author nate-pt
 * @date 2021/10/12 14:51
 * @Since 1.8
 * @Description 需要被构建的主类
 */
public class Director {

    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
