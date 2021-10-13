package com.pt.abstractFactory;

/**
 * @author nate-pt
 * @date 2021/10/12 9:59
 * @Since 1.8
 * @Description 部门行为抽象接口
 */
public interface IDepartment {

    /**
     * 部门数据插入
     * @param info
     */
    void insertInfo(Department info);

    /**
     * 通过部门id获取部门信息
     * @param id
     */
    void getInfo(String id);

}
