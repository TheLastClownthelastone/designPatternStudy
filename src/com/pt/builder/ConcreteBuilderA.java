package com.pt.builder;

/**
 * @author nate-pt
 * @date 2021/10/12 14:58
 * @Since 1.8
 * @Description
 */
public class ConcreteBuilderA extends Builder{

    private Product productA = new Product();

    @Override
    public void buildPartA() {
        productA.addPart("部件A");
    }

    @Override
    public void buildPartB() {
        productA.addPart("部件B");
    }

    @Override
    public Product getResult() {
        return productA;
    }
}
