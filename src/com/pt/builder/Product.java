package com.pt.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nate-pt
 * @date 2021/10/12 14:54
 * @Since 1.8
 * @Description 生产者类
 */
public class Product {
    List<String> parts = new ArrayList<>();

    public void addPart(String part){
        parts.add(part);
    }

    public void showParts(){
        System.out.println("产品列表：");
        parts.stream().forEach(System.out::println);
    }
}
