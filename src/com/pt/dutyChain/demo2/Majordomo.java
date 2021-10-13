package com.pt.dutyChain.demo2;

/**
 * @author nate-pt
 * @date 2021/10/13 11:42
 * @Since 1.8
 * @Description 小一级别的管理者
 */
public class Majordomo extends Manager{
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestHandler(Request request) {
        if("请假".equals(request.getRequestType()) && request.getNumber() <= 5){
            System.out.println(super.getName()+":批准"+request.getName()+"，请假"+request.getNumber()+"天");
        }else{
            if(super.superior != null){
                super.superior.requestHandler(request);
            }
        }
    }
}
