package com.pt.dutyChain.demo2;

/**
 * @author nate-pt
 * @date 2021/10/13 11:36
 * @Since 1.8
 * @Description 员工请求类型
 */
public class Request {
    /**
     * 姓名
     */
    private String name;
    /**
     * 申请类型
     */
    private String requestType;
    /**
     * 申请内容
     */
    private String requestContent;
    /**
     * 数量
     */
    private int number;

    public Request(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
