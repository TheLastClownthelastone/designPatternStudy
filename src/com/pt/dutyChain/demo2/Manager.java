package com.pt.dutyChain.demo2;

/**
 * @author nate-pt
 * @date 2021/10/13 11:33
 * @Since 1.8
 * @Description 管理者
 */
public abstract class Manager {
    /**
     * 管理者名称
     */
    private String name;

    /**
     * 上一级管理者
     */
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getSuperior() {
        return superior;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    /**
     * 申请处理
     * @param request
     */
    public abstract void requestHandler(Request request);
}
