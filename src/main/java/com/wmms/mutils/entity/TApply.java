package com.wmms.mutils.entity;

import java.util.Date;

public class TApply {
    private Long ID;

    /**
     * 库存外键
     */
    private Long inventory;

    /**
     * 申请人
     */
    private Long applicant;

    /**
     * 申请货物数量
     */
    private Integer quantity;

    /**
     * 申请时间
     */
    private Date applicationTime;

    /**
     * 进/出货
     */
    private Object type;

    /**
     * 申请状态
     */
    private Object state;

    /**
     * 入库时间
     */
    private Date warehousingTime;

    /**
     * 批准/拒绝时间
     */
    private Date approvalTime;

    /**
     * 取消时间
     */
    private Date cancelTime;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getInventory() {
        return inventory;
    }

    public void setInventory(Long inventory) {
        this.inventory = inventory;
    }

    public Long getApplicant() {
        return applicant;
    }

    public void setApplicant(Long applicant) {
        this.applicant = applicant;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
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

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", inventory=").append(inventory);
        sb.append(", applicant=").append(applicant);
        sb.append(", quantity=").append(quantity);
        sb.append(", applicationTime=").append(applicationTime);
        sb.append(", type=").append(type);
        sb.append(", state=").append(state);
        sb.append(", warehousingTime=").append(warehousingTime);
        sb.append(", approvalTime=").append(approvalTime);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append("]");
        return sb.toString();
    }
}