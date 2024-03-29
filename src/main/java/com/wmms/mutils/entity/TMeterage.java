package com.wmms.mutils.entity;

import java.util.Date;

public class TMeterage {
    private Long ID;

    /**
     * 备件
     */
    private Long ware;

    /**
     * 生产编号
     */
    private String productionNumber;

    /**
     * 检验证书编号
     */
    private String certificateNumber;

    /**
     * 精确度
     */
    private String accuracy;

    /**
     * 有效期
     */
    private Integer validityPeriod;

    /**
     * 等级
     */
    private String level;

    /**
     * 最近检验日期
     */
    private Date currentInspectionDate;

    /**
     * 计量编号
     */
    private String meterageNumber;

    /**
     * 使用地点
     */
    private String usingPlace;

    /**
     * 计量器具的状态
     */
    private Object state;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getWare() {
        return ware;
    }

    public void setWare(Long ware) {
        this.ware = ware;
    }

    public String getProductionNumber() {
        return productionNumber;
    }

    public void setProductionNumber(String productionNumber) {
        this.productionNumber = productionNumber;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getCurrentInspectionDate() {
        return currentInspectionDate;
    }

    public void setCurrentInspectionDate(Date currentInspectionDate) {
        this.currentInspectionDate = currentInspectionDate;
    }

    public String getMeterageNumber() {
        return meterageNumber;
    }

    public void setMeterageNumber(String meterageNumber) {
        this.meterageNumber = meterageNumber;
    }

    public String getUsingPlace() {
        return usingPlace;
    }

    public void setUsingPlace(String usingPlace) {
        this.usingPlace = usingPlace;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", ware=").append(ware);
        sb.append(", productionNumber=").append(productionNumber);
        sb.append(", certificateNumber=").append(certificateNumber);
        sb.append(", accuracy=").append(accuracy);
        sb.append(", validityPeriod=").append(validityPeriod);
        sb.append(", level=").append(level);
        sb.append(", currentInspectionDate=").append(currentInspectionDate);
        sb.append(", meterageNumber=").append(meterageNumber);
        sb.append(", usingPlace=").append(usingPlace);
        sb.append(", state=").append(state);
        sb.append("]");
        return sb.toString();
    }
}