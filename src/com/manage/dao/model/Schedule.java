package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Schedule implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[19] 预约人*/
    private Long memberid;

    /**[50] 预约人姓名*/
    private String name;

    /**[50] 联系电话*/
    private String phone;

    /**[50] 接送地址*/
    private String address;

    /**[19] 预约开始时间*/
    private Date starttime;

    /**[19] 预约结束时间*/
    private Date endtime;

    /**[500] 备注*/
    private String remark;

    /**[1] 类型，0：管理员创建、1：会员创建*/
    private String type;

    /**[8] 创建时间*/
    private Date createtime;

    /**[50] 创建人*/
    private String creater;

    private static final long serialVersionUID = 1L;

    /**
     * @return  Long  id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param  Long[19 NOTNULL] id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return  Long  预约人
     */
    public Long getMemberid() {
        return memberid;
    }

    /**
     * @param  Long[19] 预约人
     */
    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    /**
     * @return  String  预约人姓名
     */
    public String getName() {
        return name;
    }

    /**
     * @param  String[50] 预约人姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return  String  联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param  String[50] 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return  String  接送地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param  String[50] 接送地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return  Date  预约开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * @param  Date[19] 预约开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * @return  Date  预约结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * @param  Date[19] 预约结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * @return  String  备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param  String[500] 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * @return  String  类型，0：管理员创建、1：会员创建
     */
    public String getType() {
        return type;
    }

    /**
     * @param  String[1] 类型，0：管理员创建、1：会员创建
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return  Date  创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param  Date[8] 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return  String  创建人
     */
    public String getCreater() {
        return creater;
    }

    /**
     * @param  String[50] 创建人
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Schedule other = (Schedule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        return result;
    }
}