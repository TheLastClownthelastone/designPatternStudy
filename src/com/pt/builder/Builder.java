package com.pt.builder;

/**
 * @author nate-pt
 * @date 2021/10/12 14:52
 * @Since 1.8
 * @Description 构建器
 */
public abstract class Builder {

    /**
     * 构建A
     */
    public abstract  void buildPartA();

    /**
     * 构建B
     */
    public abstract  void buildPartB();

    /**
     * 获取生产的结果
     * @return
     */
    public abstract Product getResult();

}
