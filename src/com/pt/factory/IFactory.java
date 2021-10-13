package com.pt.factory;

/**
 * @author nate-pt
 * @date 2021/10/13 14:21
 * @Since 1.8
 * @Description 工厂抽象化
 */
public interface IFactory {

    /**
     * 抽象获取对应计算实例类
     * @return
     */
    Operation createOperation();
}
