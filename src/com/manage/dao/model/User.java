package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**[36 NOTNULL] id*/
    private String id;

    /**[50 NOTNULL] 姓名*/
    private String name;

    /**[20 NOTNULL] 登录名*/
    private String loginname;

    /**[30 NOTNULL] 登录密码*/
    private String password;

    /**[18] 身份证号码*/
    private String idnum;

    /**[1 NOTNULL] 别性0：男，1：女*/
    private String sex;

    /**[19] birthday*/
    private Date birthday;

    /**[20] 手机*/
    private String mobilephone;

    /**[20] 座机*/
    private String phone;

    /**[50] 电子邮箱*/
    private String email;

    /**[20] qq号*/
    private String qq;

    /**[30] 微信号*/
    private String microletter;

    /**[500] 地址*/
    private String address;

    /**[6] 邮编*/
    private String zipcode;

    /**[1 NOTNULL] 用户类型*/
    private String type;

    /**[1 NOTNULL] 用户状态（0:正常,1:禁用）*/
    private String status;

    /**[19 NOTNULL] 创建时间*/
    private Date createtime;

    private static final long serialVersionUID = 1L;

    /**
     * @return  String  id
     */
    public String getId() {
        return id;
    }

    /**
     * @param  String[36 NOTNULL] id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return  String  姓名
     */
    public String getName() {
        return name;
    }

    /**
     * @param  String[50 NOTNULL] 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return  String  登录名
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * @param  String[20 NOTNULL] 登录名
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * @return  String  登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param  String[30 NOTNULL] 登录密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return  String  身份证号码
     */
    public String getIdnum() {
        return idnum;
    }

    /**
     * @param  String[18] 身份证号码
     */
    public void setIdnum(String idnum) {
        this.idnum = idnum == null ? null : idnum.trim();
    }

    /**
     * @return  String  别性0：男，1：女
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param  String[1 NOTNULL] 别性0：男，1：女
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * @return  Date  birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param  Date[19] birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return  String  手机
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
     * @param  String[20] 手机
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    /**
     * @return  String  座机
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param  String[20] 座机
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return  String  电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param  String[50] 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return  String  qq号
     */
    public String getQq() {
        return qq;
    }

    /**
     * @param  String[20] qq号
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * @return  String  微信号
     */
    public String getMicroletter() {
        return microletter;
    }

    /**
     * @param  String[30] 微信号
     */
    public void setMicroletter(String microletter) {
        this.microletter = microletter == null ? null : microletter.trim();
    }

    /**
     * @return  String  地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param  String[500] 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return  String  邮编
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param  String[6] 邮编
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    /**
     * @return  String  用户类型
     */
    public String getType() {
        return type;
    }

    /**
     * @param  String[1 NOTNULL] 用户类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return  String  用户状态（0:正常,1:禁用）
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param  String[1 NOTNULL] 用户状态（0:正常,1:禁用）
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return  Date  创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param  Date[19 NOTNULL] 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getLoginname() == null ? other.getLoginname() == null : this.getLoginname().equals(other.getLoginname()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getIdnum() == null ? other.getIdnum() == null : this.getIdnum().equals(other.getIdnum()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getMobilephone() == null ? other.getMobilephone() == null : this.getMobilephone().equals(other.getMobilephone()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getMicroletter() == null ? other.getMicroletter() == null : this.getMicroletter().equals(other.getMicroletter()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getZipcode() == null ? other.getZipcode() == null : this.getZipcode().equals(other.getZipcode()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getLoginname() == null) ? 0 : getLoginname().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getIdnum() == null) ? 0 : getIdnum().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getMobilephone() == null) ? 0 : getMobilephone().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getMicroletter() == null) ? 0 : getMicroletter().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getZipcode() == null) ? 0 : getZipcode().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }
}