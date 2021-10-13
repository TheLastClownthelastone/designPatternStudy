package com.pt.abstractFactory;

/**
 * @author nate-pt
 * @date 2021/10/12 10:12
 * @Since 1.8
 * @Description mysql工厂
 */
public class MySqlFactory implements IFactory{
    @Override
    public IUser creatUser() {
        return new MysqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MysqlDepartment();
    }
}
