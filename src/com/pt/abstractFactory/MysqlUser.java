package com.pt.abstractFactory;

/**
 * @author nate-pt
 * @date 2021/10/12 10:14
 * @Since 1.8
 * @Description mysql用户行为抽象实现
 */
public class MysqlUser implements IUser{
    @Override
    public void insertInfo(User info) {
        System.out.println("mysql数据库向用户表中添加一条记录："+info);
    }

    @Override
    public void getInfo(String id) {
        System.out.println("mysql数据库往用户表中取一条数据id为：："+id);
    }
}
