package com.wmms.mutils.entity;

public class TApplyProcess {
    private Long ID;

    /**
    * 流程部署ID
    */
    private String deployId;

    private Object state;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getDeployId() {
        return deployId;
    }

    public void setDeployId(String deployId) {
        this.deployId = deployId;
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
        sb.append(", deployId=").append(deployId);
        sb.append(", state=").append(state);
        sb.append("]");
        return sb.toString();
    }
}