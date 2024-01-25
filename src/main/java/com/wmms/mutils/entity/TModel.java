package com.wmms.mutils.entity;

public class TModel {
    private Long ID;

    /**
    * 类别
    */
    private Long kind;

    /**
    * 详细内容
    */
    private String name;

    /**
    * 生产厂家
    */
    private Long company;

    /**
    * 单位
    */
    private Long unit;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getKind() {
        return kind;
    }

    public void setKind(Long kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCompany() {
        return company;
    }

    public void setCompany(Long company) {
        this.company = company;
    }

    public Long getUnit() {
        return unit;
    }

    public void setUnit(Long unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", kind=").append(kind);
        sb.append(", name=").append(name);
        sb.append(", company=").append(company);
        sb.append(", unit=").append(unit);
        sb.append("]");
        return sb.toString();
    }
}