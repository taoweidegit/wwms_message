package com.wmms.mutils.entity;

public class TWareKind {
    private Long ID;

    /**
    * 种类名称
    */
    private String name;

    /**
    * 父类
    */
    private Integer pid;

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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", name=").append(name);
        sb.append(", pid=").append(pid);
        sb.append("]");
        return sb.toString();
    }
}