package com.pt.abstractFactory;

/**
 * @author nate-pt
 * @date 2021/10/12 9:56
 * @Since 1.8
 * @Description 用户行为接口
 */
public interface IUser {

    /**
     * 用户数据插入
     * @param info
     */
    void insertInfo(User info);

    /**
     * 通过用户id获取用户信息
     * @param id
     */
    void getInfo(String id);

}
