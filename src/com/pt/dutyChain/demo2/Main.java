package com.pt.dutyChain.demo2;

/**
 * @author nate-pt
 * @date 2021/10/13 11:43
 * @Since 1.8
 * @Description 责任链模式模拟员工想领导发送申请
 */
public class Main {
    public static void main(String[] args) {
        CommonManager commonManager = new CommonManager("景丽");
        Majordomo majordomo = new Majordomo("宗建");
        GeneralManager generalManager = new GeneralManager("宗金丽");

        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Request r = new Request("小菜");

        r.setRequestType("请假");
        r.setRequestContent("小菜请假");
        r.setNumber(2);
        commonManager.requestHandler(r);

        Request r1 = new Request("小菜1");

        r1.setRequestType("请假");
        r1.setRequestContent("小菜1请假");
        r1.setNumber(4);
        commonManager.requestHandler(r1);

        Request r2 = new Request("小菜2");

        r2.setRequestType("请假");
        r2.setRequestContent("小菜2请假");
        r2.setNumber(6);
        commonManager.requestHandler(r2);

        Request r3 = new Request("小菜3");
        r3.setRequestType("加薪");
        r3.setRequestContent("小菜3加薪");
        r3.setNumber(1000);
        commonManager.requestHandler(r3);

        Request r4 = new Request("小菜4");
        r4.setRequestType("加薪");
        r4.setRequestContent("小菜4加薪");
        r4.setNumber(400);
        commonManager.requestHandler(r4);
    }
}
