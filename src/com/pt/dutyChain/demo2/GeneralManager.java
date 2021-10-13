package com.pt.dutyChain.demo2;

/**
 * @author nate-pt
 * @date 2021/10/13 11:41
 * @Since 1.8
 * @Description 总经理
 */
public class GeneralManager extends Manager{
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestHandler(Request request) {
        if("请假".equals(request.getRequestType())){
            System.out.println(super.getName()+":批准"+request.getName()+"，请假"+request.getNumber()+"天");
        }else if("加薪".equals(request.getRequestType()) && request.getNumber() <= 500){
            System.out.println(super.getName()+":批准"+request.getName()+"，加薪"+request.getNumber()+"元");
        }else if("加薪".equals(request.getRequestType()) && request.getNumber() >= 500){
            System.out.println(super.getName()+":"+request.getName()+"加薪"+request.getNumber()+"元，再说吧");
        }
    }
}
