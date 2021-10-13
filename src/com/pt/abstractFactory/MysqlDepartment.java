package com.pt.abstractFactory;

/**
 * @author nate-pt
 * @date 2021/10/12 10:21
 * @Since 1.8
 * @Description
 */
public class MysqlDepartment implements IDepartment{
    @Override
    public void insertInfo(Department info) {
        System.out.println("mysql数据库向部门中添加一条记录："+info);
    }

    @Override
    public void getInfo(String id) {
        System.out.println("mysql数据库向部门中查询记录id为：："+id);
    }
}
