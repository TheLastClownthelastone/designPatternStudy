package com.pt.memento;

/**
 * @author nate-pt
 * @date 2021/10/14 9:37
 * @Since 1.8
 * @Description 角色状态备忘录
 */
public class RoleStateMemento {
    /** 生命力*/
    private int vit;
    /** 攻击力*/
    private int ack;
    /** 防御力*/
    private int def;


    public RoleStateMemento(int vit,int ack,int def) {
        this.vit = vit;
        this.ack = ack;
        this.def = def;
    }


    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAck() {
        return ack;
    }

    public void setAck(int ack) {
        this.ack = ack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
