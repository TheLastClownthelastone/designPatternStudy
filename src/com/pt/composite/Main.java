package com.pt.composite;

/**
 * @author nate-pt
 * @date 2021/10/12 16:18
 * @Since 1.8
 * @Description 组合模式
 * 类似树形结构的代码分为根结构以及叶子结构处理业务代码
 */
public class Main {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("总公司");

        root.add(new HrDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");

        comp.add(new HrDepartment("华东分公司人力资源部"));
        comp.add(new FinanceDepartment("华东分公司财务部"));

        root.add(comp);

        ConcreteCompany comp2 = new ConcreteCompany("江苏办事处");

        comp2.add(new HrDepartment("江苏办事处人力资源部"));
        comp2.add(new FinanceDepartment("江苏办事处财务部"));

        ConcreteCompany comp3 = new ConcreteCompany("浙江办事处");

        comp3.add(new HrDepartment("浙江办事处人力资源部"));
        comp3.add(new FinanceDepartment("浙江办事处财务部"));

        comp.add(comp2);
        comp.add(comp3);
        System.out.println("公司组织结构图:");
        root.disPlay(1);
        System.out.println("公司组织职责:");
        root.lineOfDuty();
    }
}
