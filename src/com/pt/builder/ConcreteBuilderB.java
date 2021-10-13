package com.pt.builder;

/**
 * @author nate-pt
 * @date 2021/10/12 15:00
 * @Since 1.8
 * @Description
 */
public class ConcreteBuilderB extends Builder{
    private Product productB = new Product();

    @Override
    public void buildPartA() {
        productB.addPart("部件X");
    }

    @Override
    public void buildPartB() {
        productB.addPart("部件Y");
    }

    @Override
    public Product getResult() {
        return productB;
    }
}
