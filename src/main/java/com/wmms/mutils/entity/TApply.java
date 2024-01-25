package com.wmms.mutils.entity;

import java.util.Date;

public class TApply {
    private Long ID;

    /**
     * 申请人
     */
    private Long applicant;

    /**
     * 入库备件数量
     */
    private Integer wareQuantity;

    /**
     * 申请时间
     */
    private Date applicationTime;

    /**
     * 申请状态
     */
    private Object state;

    /**
     * 入库时间
     */
    private Date warehousingTime;

    /**
     * 备件
     */
    private Long ware;

    /**
     * 申请的备件数量
     */
    private Integer applyQuantity;

    /**
     * 备件所存放的仓库
     */
    private Long warehouse;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getApplicant() {
        return applicant;
    }

    public void setApplicant(Long applicant) {
        this.applicant = applicant;
    }

    public Integer getWareQuantity() {
        return wareQuantity;
    }

    public void setWareQuantity(Integer wareQuantity) {
        this.wareQuantity = wareQuantity;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Date getWarehousingTime() {
        return warehousingTime;
    }

    public void setWarehousingTime(Date warehousingTime) {
        this.warehousingTime = warehousingTime;
    }

    public Long getWare() {
        return ware;
    }

    public void setWare(Long ware) {
        this.ware = ware;
    }

    public Integer getApplyQuantity() {
        return applyQuantity;
    }

    public void setApplyQuantity(Integer applyQuantity) {
        this.applyQuantity = applyQuantity;
    }

    public Long getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", applicant=").append(applicant);
        sb.append(", wareQuantity=").append(wareQuantity);
        sb.append(", applicationTime=").append(applicationTime);
        sb.append(", state=").append(state);
        sb.append(", warehousingTime=").append(warehousingTime);
        sb.append(", ware=").append(ware);
        sb.append(", applyQuantity=").append(applyQuantity);
        sb.append(", warehouse=").append(warehouse);
        sb.append("]");
        return sb.toString();
    }
}