package com.pt.abstractFactory;

/**
 * @author nate-pt
 * @date 2021/10/12 10:13
 * @Since 1.8
 * @Description oracle 工厂
 */
public class OracleFactory implements IFactory {
    @Override
    public IUser creatUser() {
        return new OracleUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new OracleDepartment();
    }
}
