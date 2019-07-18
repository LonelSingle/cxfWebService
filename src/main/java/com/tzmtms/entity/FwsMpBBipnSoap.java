package com.tzmtms.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/7/16 0016.
 */
public class FwsMpBBipnSoap implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;//物料批次 需要
    private String partment;//厂别 需要
    private String step;//工序 需要
    private String expDate;//过期日期 需要
    private String mftDate;//生产日期 需要
    private String totalQty;//数量 需要
    private String userId;//领料人ID 需要
    private String userName;//领料人姓名 需要
    private String materialNum;//物料料号 需要
    private String sapCode;//sap批次 需要
    public FwsMpBBipnSoap() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPartment() {
        return partment;
    }

    public void setPartment(String partment) {
        this.partment = partment;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getMftDate() {
        return mftDate;
    }

    public void setMftDate(String mftDate) {
        this.mftDate = mftDate;
    }

    public String getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(String totalQty) {
        this.totalQty = totalQty;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMaterialNum() {
        return materialNum;
    }

    public void setMaterialNum(String materialNum) {
        this.materialNum = materialNum;
    }

    public String getSapCode() {
        return sapCode;
    }

    public void setSapCode(String sapCode) {
        this.sapCode = sapCode;
    }
}
