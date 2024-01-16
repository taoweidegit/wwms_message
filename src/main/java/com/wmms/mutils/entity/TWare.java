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
        sb.append("]");
        return sb.toString();
    }
}