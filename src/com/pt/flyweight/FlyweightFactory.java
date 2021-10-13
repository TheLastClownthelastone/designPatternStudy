package com.pt.flyweight;

import java.util.Hashtable;

/**
 * @author nate-pt
 * @date 2021/10/13 14:38
 * @Since 1.8
 * @Description
 */
public class FlyweightFactory {
    /**
     * 内部用hashTable 或者hashMap 将享元的对象进行储存
     */
    private Hashtable<String,Object> flytables = new Hashtable<>();

    public FlyweightFactory(){
        flytables.put("X", new ConcreteFlyweight());
        flytables.put("Y", new ConcreteFlyweight());
        flytables.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyWeight(String key){
        if (!flytables.contains(key)) {
            flytables.put(key,new ConcreteFlyweight());
        }
        return (Flyweight) flytables.get(key);
    }

}

