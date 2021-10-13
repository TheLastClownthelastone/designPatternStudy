package com.pt.mediator;

/**
 * @author nate-pt
 * @date 2021/10/13 15:36
 * @Since 1.8
 * @Description 中介者模式
 * 两个类或者多个类进行通讯的时候
 * 利用媒介类进行处理其中媒介类中必须包含需要通讯的所有类的实例
 */
public class Main {


    public static void main(String[] args) {

        UniteNationsSecurityCouncil unsc = new UniteNationsSecurityCouncil();


        USA a = new USA(unsc);
        Iraq b = new Iraq(unsc);

        unsc.setUsa(a);
        unsc.setIraq(b);

        a.send("不许研制核武器，否则就发动战争！");
        b.send("我们没有核武器，不发动战争！");
    }


}
