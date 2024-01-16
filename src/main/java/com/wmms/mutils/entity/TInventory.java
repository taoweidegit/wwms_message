package com.wmms.mutils.entity;

public class TInventory {
    private Long ID;

    /**
    * 物品
    */
    private Long ware;

    /**
    * 库存
    */
    private Integer quantity;

    /**
    * 货架位置
    */
    private Long shelve;

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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getShelve() {
        return shelve;
    }

    public void setShelve(Long shelve) {
        this.shelve = shelve;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", ware=").append(ware);
        sb.append(", quantity=").append(quantity);
        sb.append(", shelve=").append(shelve);
        sb.append("]");
        return sb.toString();
    }
}