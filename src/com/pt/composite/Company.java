package com.pt.composite;

/**
 * @author nate-pt
 * @date 2021/10/12 16:19
 * @Since 1.8
 * @Description 抽象公司对象
 */
public abstract class Company {

    protected  String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 添加
     * @param company
     */
    public abstract void add(Company company);

    /**
     * 移除
     * @param company
     */
    public abstract  void remove(Company company);

    /**
     * 设置层级
     * @param depth
     */
    public abstract void disPlay(int depth);

    /**
     * 追画横线
     */
    public abstract void lineOfDuty();

}
