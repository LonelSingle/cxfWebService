package com.tzmtms.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/7/9 0009.
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    private String msg;
    private String flag;

    public Message() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
