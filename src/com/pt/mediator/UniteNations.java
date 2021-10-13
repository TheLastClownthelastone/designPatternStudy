package com.pt.mediator;

/**
 * @author nate-pt
 * @date 2021/10/13 16:36
 * @Since 1.8
 * @Description 联合国类
 */
public abstract class UniteNations {

    /**
     * 中介方法
     * @param message
     * @param country
     */
    public abstract  void declare(String message,Country country);
}
