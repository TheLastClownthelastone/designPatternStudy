package com.pt.composite;

/**
 * @author nate-pt
 * @date 2021/10/12 16:29
 * @Since 1.8
 * @Description 财务部
 */
public class FinanceDepartment extends Company{
    public FinanceDepartment(String name) {
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
        System.out.println(sb.toString()+name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+",公司财务收支管理");
    }
}
