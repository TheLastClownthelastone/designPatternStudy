package com.pt.mediator;

/**
 * @author nate-pt
 * @date 2021/10/13 16:39
 * @Since 1.8
 * @Description 中介类
 */
public class UniteNationsSecurityCouncil extends UniteNations{
    /** 媒介国家*/
    private Iraq iraq;
    private USA usa;

    @Override
    public void declare(String message, Country country) {
        if(usa == country){
            iraq.notifyInfo(message);
        }else{
            usa.notifyInfo(message);
        }
    }

    public USA getUsa() {
        return usa;
    }
    public void setUsa(USA usa) {
        this.usa = usa;
    }
    public Iraq getIraq() {
        return iraq;
    }
    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }
}
