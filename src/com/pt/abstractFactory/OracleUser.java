package com.pt.abstractFactory;

/**
 * @author nate-pt
 * @date 2021/10/12 10:20
 * @Since 1.8
 * @Description
 */
public class OracleUser implements IUser{
    @Override
    public void insertInfo(User info) {
        System.out.println("oracle数据库向用户表中添加一条记录："+info);
    }

    @Override
    public void getInfo(String id) {
        System.out.println("oracle数据库往用户表中取一条数据id为：："+id);
    }
}
