package com.pt.dutyChain.demo2;

/**
 * @author nate-pt
 * @date 2021/10/13 11:39
 * @Since 1.8
 * @Description 通用管理者
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestHandler(Request request) {
        if("请假".equals(request.getRequestType()) && request.getNumber() <= 2){
            System.out.println(super.getName()+":批准"+request.getName()+"，请假"+request.getNumber()+"天");
        }else{
            if(super.superior != null){
                super.superior.requestHandler(request);
            }
        }
    }
}
