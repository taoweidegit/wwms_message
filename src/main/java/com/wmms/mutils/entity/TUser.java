package com.wmms.mutils.entity;

public class TUser {
    private Long ID;

    /**
    * 姓名
    */
    private String name;

    /**
    * 工号
    */
    private String eid;

    /**
    * 微信open_id
    */
    private String wx_id;

    /**
    * 班组
    */
    private Long department;

    /**
    * 职务
    */
    private Long role;

    /**
    * 手机号码
    */
    private String mobile;

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

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getWx_id() {
        return wx_id;
    }

    public void setWx_id(String wx_id) {
        this.wx_id = wx_id;
    }

    public Long getDepartment() {
        return department;
    }

    public void setDepartment(Long department) {
        this.department = department;
    }

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
        this.role = role;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", name=").append(name);
        sb.append(", eid=").append(eid);
        sb.append(", wx_id=").append(wx_id);
        sb.append(", department=").append(department);
        sb.append(", role=").append(role);
        sb.append(", mobile=").append(mobile);
        sb.append("]");
        return sb.toString();
    }
}