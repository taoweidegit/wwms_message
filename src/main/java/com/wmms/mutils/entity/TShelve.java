package com.wmms.mutils.entity;

public class TShelve {
    private Long ID;

    /**
    * 仓库
    */
    private Long wareHouse;

    /**
    * 二维码
    */
    private Long code;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(Long wareHouse) {
        this.wareHouse = wareHouse;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", wareHouse=").append(wareHouse);
        sb.append(", code=").append(code);
        sb.append("]");
        return sb.toString();
    }
}