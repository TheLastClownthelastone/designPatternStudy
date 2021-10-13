package com.pt.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nate-pt
 * @date 2021/10/12 16:24
 * @Since 1.8
 * @Description 混合公司类型
 */
public class ConcreteCompany extends Company{

    private List<Company> childList = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        childList.add(company);
    }

    @Override
    public void remove(Company company) {
        childList.remove(company);
    }

    @Override
    public void disPlay(int depth) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            builder.append("-");
        }

        System.out.println(builder.toString()+name);

        for (Company company : childList) {
            company.disPlay(depth+2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : childList) {
            company.lineOfDuty();
        }
    }
}
