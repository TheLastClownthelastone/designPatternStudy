package com.pt.memento;

/**
 * @author nate-pt
 * @date 2021/10/14 9:39
 * @Since 1.8
 * @Description
 */
public class RoleStateCareTaker {

    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
