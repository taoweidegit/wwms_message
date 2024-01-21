package com.wmms.mutils.entity;

public class TWare {
    private Long ID;

    /**
     * 名称
     */
    private String name;

    /**
     * 型号
     */
    private String model;

    /**
     * 种类
     */
    private Long kind;

    /**
     * 物品单位
     */
    private Long unit;

    /**
     * 公司
     */
    private Long company;

    /**
     * 料号
     */
    private String itemNumber;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getKind() {
        return kind;
    }

    public void setKind(Long kind) {
        this.kind = kind;
    }

    public Long getUnit() {
        return unit;
    }

    public void setUnit(Long unit) {
        this.unit = unit;
    }

    public Long getCompany() {
        return company;
    }

    public void setCompany(Long company) {
        this.company = company;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", name=").append(name);
        sb.append(", model=").append(model);
        sb.append(", kind=").append(kind);
        sb.append(", unit=").append(unit);
        sb.append(", company=").append(company);
        sb.append(", itemNumber=").append(itemNumber);
        sb.append("]");
        return sb.toString();
    }
}