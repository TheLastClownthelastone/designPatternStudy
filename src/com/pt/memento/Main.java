package com.pt.memento;

/**
 * @author nate-pt
 * @date 2021/10/14 9:29
 * @Since 1.8
 * @Description 备忘录模式
 * 将即将改变的对象设置备忘录储存该对象的出事状态
 * 一般用于变量进行复原操作中使用
 */
public class Main {
    public static void main(String[] args) {
        GameRole gr = new GameRole();

        gr.getInitState();

        gr.showState();

        System.out.println("存档！！！");
        RoleStateCareTaker taker = new RoleStateCareTaker();
        taker.setMemento(gr.saveState());
        System.out.println("决战BOSS");
        gr.fight();
        gr.showState();

        System.out.println("读取存档");
        gr.recoverRoleState(taker.getMemento());
        gr.showState();

    }
}
