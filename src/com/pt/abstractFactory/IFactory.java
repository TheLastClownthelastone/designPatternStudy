package com.pt.abstractFactory;

/**
 * @author nate-pt
 * @date 2021/10/12 9:55
 * @Since 1.8
 * @Description 顶级抽象工程用来制定床架用户和部门具体实例
 */
public interface IFactory {

    /**
     * 得到用户行为接口
     * @return
     */
    IUser creatUser();

    /**
     * 得到部门行为接口
     * @return
     */
    IDepartment createDepartment();


}
