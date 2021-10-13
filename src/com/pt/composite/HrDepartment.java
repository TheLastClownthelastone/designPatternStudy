package com.pt.composite;

/**
 * @author nate-pt
 * @date 2021/10/12 16:32
 * @Since 1.8
 * @Description 人力资源部
 */
public class HrDepartment extends Company{
    public HrDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Company company) {
        System.out.println("Cannot remove to a leaf");
    }

    @Override
    public void disPlay(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }

        System.out.println(sb.toString() + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+",员工招聘培训管理");
    }
}
