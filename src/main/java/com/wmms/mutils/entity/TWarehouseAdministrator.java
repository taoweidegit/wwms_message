package com.wmms.mutils.entity;

public class TWarehouseAdministrator {
    private Long ID;

    /**
    * 管理员用户主键
    */
    private Long administrator;

    /**
    * 负责入库或出库
    */
    private Object role;

    /**
    * 仓库主键
    */
    private Long warehouse;

    /**
    * 是否为主要负责人
    */
    private Object IS_Master;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Long administrator) {
        this.administrator = administrator;
    }

    public Object getRole() {
        return role;
    }

    public void setRole(Object role) {
        this.role = role;
    }

    public Long getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse;
    }

    public Object getIS_Master() {
        return IS_Master;
    }

    public void setIS_Master(Object IS_Master) {
        this.IS_Master = IS_Master;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", administrator=").append(administrator);
        sb.append(", role=").append(role);
        sb.append(", warehouse=").append(warehouse);
        sb.append(", IS_Master=").append(IS_Master);
        sb.append("]");
        return sb.toString();
    }
}