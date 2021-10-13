package com.pt.abstractFactory;

/**
 * @author nate-pt
 * @date 2021/10/12 9:44
 * @Since 1.8
 * @Description 抽象工厂模式
 * 制定一个或一系列相关或相互依赖对象的接口，无需制定具体实现类
 * 将实现类中的行为（也就是方法进行抽象为一个接口）
 * 将对象的行为进行抽象   ·
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("1","pt");
        Department department = new Department("1","ptDepartment");

        IFactory factory1 = new MySqlFactory();
        IFactory factory2 = new OracleFactory();

        IUser iUser1 = factory1.creatUser();
        IDepartment department1 = factory1.createDepartment();

        IUser iUser2 = factory2.creatUser();
        IDepartment department2 = factory2.createDepartment();

        iUser1.getInfo("1");
        iUser1.insertInfo(user);

        department1.getInfo("1");
        department1.insertInfo(department);


        iUser2.getInfo("1");
        iUser2.insertInfo(user);

        department2.getInfo("1");
        department2.insertInfo(department);

    }

}
