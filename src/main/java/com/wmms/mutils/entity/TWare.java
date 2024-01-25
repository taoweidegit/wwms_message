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
    private Long model;

    /**
     * 种类
     */
    private Long kind;

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

    public Long getModel() {
        return model;
    }

    public void setModel(Long model) {
        this.model = model;
    }

    public Long getKind() {
        return kind;
    }

    public void setKind(Long kind) {
        this.kind = kind;
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
        sb.append(", itemNumber=").append(itemNumber);
        sb.append("]");
        return sb.toString();
    }
}