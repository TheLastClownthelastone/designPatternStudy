package com.pt.memento;

/**
 * @author nate-pt
 * @date 2021/10/14 9:32
 * @Since 1.8
 * @Description 游戏规则
 */
public class GameRole {
    /** 生命力*/
    private int vit;
    /** 攻击力*/
    private int ack;
    /** 防御力*/
    private int def;

    /**
     * 显示玩家状态
     */
    public void showState(){
        System.out.println("角色当前状态：");
        System.out.println("生命力:"+vit);
        System.out.println("攻击力:"+ack);
        System.out.println("防御力:"+def);
    }

    /**
     * 获取初始状态
     */
    public void getInitState(){
        this.vit = 100;
        this.ack = 100;
        this.def = 100;
    }

    /**
     * 与boss战斗
     */
    public void fight(){
        this.vit = 0;
        this.ack = 0;
        this.def = 0;
    }


    public GameRole(int vit, int ack, int def) {
        this.vit = vit;
        this.ack = ack;
        this.def = def;
    }

    public GameRole() {
    }

    /**
     * 保存角色状态
     * @return
     */
    public RoleStateMemento saveState(){
        return new RoleStateMemento(this.vit, this.ack, this.def);
    }

    /**
     * 回复角色状态
     * @param memento
     */
    public void recoverRoleState(RoleStateMemento memento){
        this.vit = memento.getVit();
        this.ack = memento.getAck();
        this.def = memento.getDef();
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
