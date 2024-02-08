package com.wmms.mutils.entity;

public class TInventory {
    private Long ID;

    /**
     * 型号
     */
    private Long model;

    /**
     * 出厂编号
     */
    private String productionNumber;

    /**
     * 货架位置
     */
    private Long shelve;

    /**
     * 状态
     */
    private Object state;

    /**
     * Apply表主键
     */
    private Long apply;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getModel() {
        return model;
    }

    public void setModel(Long model) {
        this.model = model;
    }

    public String getProductionNumber() {
        return productionNumber;
    }

    public void setProductionNumber(String productionNumber) {
        this.productionNumber = productionNumber;
    }

    public Long getShelve() {
        return shelve;
    }

    public void setShelve(Long shelve) {
        this.shelve = shelve;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Long getApply() {
        return apply;
    }

    public void setApply(Long apply) {
        this.apply = apply;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", model=").append(model);
        sb.append(", productionNumber=").append(productionNumber);
        sb.append(", shelve=").append(shelve);
        sb.append(", state=").append(state);
        sb.append(", apply=").append(apply);
        sb.append("]");
        return sb.toString();
    }
}