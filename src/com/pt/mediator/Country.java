package com.pt.mediator;

/**
 * @author nate-pt
 * @date 2021/10/13 16:35
 * @Since 1.8
 * @Description 国家类
 */
public abstract class Country {

    protected UniteNations uniteNations;

    public Country(UniteNations uniteNations) {
        this.uniteNations = uniteNations;
    }
}
