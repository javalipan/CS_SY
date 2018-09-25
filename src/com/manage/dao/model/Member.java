package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[36] openid*/
    private String openid;

    /**[36] Unionid*/
    private String unionid;

    /**[50] 会员卡编号*/
    private String membercode;

    /**[50] 会员昵称*/
    private String nickname;

    /**[250] 头像*/
    private String headurl;

    /**[50] 姓名*/
    private String name;

    /**[1] 性别，0：男，1：女*/
    private String sex;

    /**[19] 出生日期*/
    private Date birthday;

    /**[20] 联系电话*/
    private String phone;

    /**[10] 地址id*/
    private Integer addressid;

    /**[250] 详细地址*/
    private String detailaddress;

    /**[1] 是否已完善信息*/
    private String isfinish;

    /**[22] 总消费金额*/
    private Double totalmoney;

    /**[10] 会员积分*/
    private Integer memberpoint;

    /**[10] 会员等级*/
    private Integer memberlevel;

    /**[1] 是否接收微信推送,0：是，1：否*/
    private String isrecwx;

    /**[1] 是否接收短信推送,0：是，1：否*/
    private String isrecmsg;

    /**[19] 推广来源*/
    private Long fromuser;

    /**[1] 状态，0：关注，1：取消关注，2：禁用*/
    private String status;

    /**[19] 注册时间*/
    private Date registertime;

    /**[19] 取消关注时间*/
    private Date canceltime;

    /**[22 NOTNULL] 余额*/
    private Double balance;

    /**[22] 折扣*/
    private Double discount;

    /**[1] 新老顾客,1:新顾客，2：老顾客*/
    private String oldornew;

    /**[19] 最后购买日期*/
    private Date lastbuytime;

    /**[19] 会员等级变动日期*/
    private Date levelchangetime;

    /**[2] 会员类型，R:注册,N:新顾客,E:活跃顾客,S1:瞌睡顾客,S2:半睡顾客,S3:沉睡顾客,X1:唤醒瞌睡,X2:唤醒半睡,X3:唤醒沉睡*/
    private String membertype;

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
     * @return  String  openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * @param  String[36] openid
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * @return  String  Unionid
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * @param  String[36] Unionid
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * @return  String  会员卡编号
     */
    public String getMembercode() {
        return membercode;
    }

    /**
     * @param  String[50] 会员卡编号
     */
    public void setMembercode(String membercode) {
        this.membercode = membercode == null ? null : membercode.trim();
    }

    /**
     * @return  String  会员昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param  String[50] 会员昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * @return  String  头像
     */
    public String getHeadurl() {
        return headurl;
    }

    /**
     * @param  String[250] 头像
     */
    public void setHeadurl(String headurl) {
        this.headurl = headurl == null ? null : headurl.trim();
    }

    /**
     * @return  String  姓名
     */
    public String getName() {
        return name;
    }

    /**
     * @param  String[50] 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return  String  性别，0：男，1：女
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param  String[1] 性别，0：男，1：女
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * @return  Date  出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param  Date[19] 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return  String  联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param  String[20] 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return  Integer  地址id
     */
    public Integer getAddressid() {
        return addressid;
    }

    /**
     * @param  Integer[10] 地址id
     */
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    /**
     * @return  String  详细地址
     */
    public String getDetailaddress() {
        return detailaddress;
    }

    /**
     * @param  String[250] 详细地址
     */
    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }

    /**
     * @return  String  是否已完善信息
     */
    public String getIsfinish() {
        return isfinish;
    }

    /**
     * @param  String[1] 是否已完善信息
     */
    public void setIsfinish(String isfinish) {
        this.isfinish = isfinish == null ? null : isfinish.trim();
    }

    /**
     * @return  Double  总消费金额
     */
    public Double getTotalmoney() {
        return totalmoney;
    }

    /**
     * @param  Double[22] 总消费金额
     */
    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    /**
     * @return  Integer  会员积分
     */
    public Integer getMemberpoint() {
        return memberpoint;
    }

    /**
     * @param  Integer[10] 会员积分
     */
    public void setMemberpoint(Integer memberpoint) {
        this.memberpoint = memberpoint;
    }

    /**
     * @return  Integer  会员等级
     */
    public Integer getMemberlevel() {
        return memberlevel;
    }

    /**
     * @param  Integer[10] 会员等级
     */
    public void setMemberlevel(Integer memberlevel) {
        this.memberlevel = memberlevel;
    }

    /**
     * @return  String  是否接收微信推送,0：是，1：否
     */
    public String getIsrecwx() {
        return isrecwx;
    }

    /**
     * @param  String[1] 是否接收微信推送,0：是，1：否
     */
    public void setIsrecwx(String isrecwx) {
        this.isrecwx = isrecwx == null ? null : isrecwx.trim();
    }

    /**
     * @return  String  是否接收短信推送,0：是，1：否
     */
    public String getIsrecmsg() {
        return isrecmsg;
    }

    /**
     * @param  String[1] 是否接收短信推送,0：是，1：否
     */
    public void setIsrecmsg(String isrecmsg) {
        this.isrecmsg = isrecmsg == null ? null : isrecmsg.trim();
    }

    /**
     * @return  Long  推广来源
     */
    public Long getFromuser() {
        return fromuser;
    }

    /**
     * @param  Long[19] 推广来源
     */
    public void setFromuser(Long fromuser) {
        this.fromuser = fromuser;
    }

    /**
     * @return  String  状态，0：关注，1：取消关注，2：禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param  String[1] 状态，0：关注，1：取消关注，2：禁用
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return  Date  注册时间
     */
    public Date getRegistertime() {
        return registertime;
    }

    /**
     * @param  Date[19] 注册时间
     */
    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    /**
     * @return  Date  取消关注时间
     */
    public Date getCanceltime() {
        return canceltime;
    }

    /**
     * @param  Date[19] 取消关注时间
     */
    public void setCanceltime(Date canceltime) {
        this.canceltime = canceltime;
    }

    /**
     * @return  Double  余额
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * @param  Double[22 NOTNULL] 余额
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * @return  Double  折扣
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param  Double[22] 折扣
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * @return  String  新老顾客,1:新顾客，2：老顾客
     */
    public String getOldornew() {
        return oldornew;
    }

    /**
     * @param  String[1] 新老顾客,1:新顾客，2：老顾客
     */
    public void setOldornew(String oldornew) {
        this.oldornew = oldornew == null ? null : oldornew.trim();
    }

    /**
     * @return  Date  最后购买日期
     */
    public Date getLastbuytime() {
        return lastbuytime;
    }

    /**
     * @param  Date[19] 最后购买日期
     */
    public void setLastbuytime(Date lastbuytime) {
        this.lastbuytime = lastbuytime;
    }

    /**
     * @return  Date  会员等级变动日期
     */
    public Date getLevelchangetime() {
        return levelchangetime;
    }

    /**
     * @param  Date[19] 会员等级变动日期
     */
    public void setLevelchangetime(Date levelchangetime) {
        this.levelchangetime = levelchangetime;
    }

    /**
     * @return  String  会员类型，R:注册,N:新顾客,E:活跃顾客,S1:瞌睡顾客,S2:半睡顾客,S3:沉睡顾客,X1:唤醒瞌睡,X2:唤醒半睡,X3:唤醒沉睡
     */
    public String getMembertype() {
        return membertype;
    }

    /**
     * @param  String[2] 会员类型，R:注册,N:新顾客,E:活跃顾客,S1:瞌睡顾客,S2:半睡顾客,S3:沉睡顾客,X1:唤醒瞌睡,X2:唤醒半睡,X3:唤醒沉睡
     */
    public void setMembertype(String membertype) {
        this.membertype = membertype == null ? null : membertype.trim();
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
        Member other = (Member) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getUnionid() == null ? other.getUnionid() == null : this.getUnionid().equals(other.getUnionid()))
            && (this.getMembercode() == null ? other.getMembercode() == null : this.getMembercode().equals(other.getMembercode()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getHeadurl() == null ? other.getHeadurl() == null : this.getHeadurl().equals(other.getHeadurl()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getAddressid() == null ? other.getAddressid() == null : this.getAddressid().equals(other.getAddressid()))
            && (this.getDetailaddress() == null ? other.getDetailaddress() == null : this.getDetailaddress().equals(other.getDetailaddress()))
            && (this.getIsfinish() == null ? other.getIsfinish() == null : this.getIsfinish().equals(other.getIsfinish()))
            && (this.getTotalmoney() == null ? other.getTotalmoney() == null : this.getTotalmoney().equals(other.getTotalmoney()))
            && (this.getMemberpoint() == null ? other.getMemberpoint() == null : this.getMemberpoint().equals(other.getMemberpoint()))
            && (this.getMemberlevel() == null ? other.getMemberlevel() == null : this.getMemberlevel().equals(other.getMemberlevel()))
            && (this.getIsrecwx() == null ? other.getIsrecwx() == null : this.getIsrecwx().equals(other.getIsrecwx()))
            && (this.getIsrecmsg() == null ? other.getIsrecmsg() == null : this.getIsrecmsg().equals(other.getIsrecmsg()))
            && (this.getFromuser() == null ? other.getFromuser() == null : this.getFromuser().equals(other.getFromuser()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRegistertime() == null ? other.getRegistertime() == null : this.getRegistertime().equals(other.getRegistertime()))
            && (this.getCanceltime() == null ? other.getCanceltime() == null : this.getCanceltime().equals(other.getCanceltime()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getOldornew() == null ? other.getOldornew() == null : this.getOldornew().equals(other.getOldornew()))
            && (this.getLastbuytime() == null ? other.getLastbuytime() == null : this.getLastbuytime().equals(other.getLastbuytime()))
            && (this.getLevelchangetime() == null ? other.getLevelchangetime() == null : this.getLevelchangetime().equals(other.getLevelchangetime()))
            && (this.getMembertype() == null ? other.getMembertype() == null : this.getMembertype().equals(other.getMembertype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getUnionid() == null) ? 0 : getUnionid().hashCode());
        result = prime * result + ((getMembercode() == null) ? 0 : getMembercode().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getHeadurl() == null) ? 0 : getHeadurl().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getAddressid() == null) ? 0 : getAddressid().hashCode());
        result = prime * result + ((getDetailaddress() == null) ? 0 : getDetailaddress().hashCode());
        result = prime * result + ((getIsfinish() == null) ? 0 : getIsfinish().hashCode());
        result = prime * result + ((getTotalmoney() == null) ? 0 : getTotalmoney().hashCode());
        result = prime * result + ((getMemberpoint() == null) ? 0 : getMemberpoint().hashCode());
        result = prime * result + ((getMemberlevel() == null) ? 0 : getMemberlevel().hashCode());
        result = prime * result + ((getIsrecwx() == null) ? 0 : getIsrecwx().hashCode());
        result = prime * result + ((getIsrecmsg() == null) ? 0 : getIsrecmsg().hashCode());
        result = prime * result + ((getFromuser() == null) ? 0 : getFromuser().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRegistertime() == null) ? 0 : getRegistertime().hashCode());
        result = prime * result + ((getCanceltime() == null) ? 0 : getCanceltime().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getOldornew() == null) ? 0 : getOldornew().hashCode());
        result = prime * result + ((getLastbuytime() == null) ? 0 : getLastbuytime().hashCode());
        result = prime * result + ((getLevelchangetime() == null) ? 0 : getLevelchangetime().hashCode());
        result = prime * result + ((getMembertype() == null) ? 0 : getMembertype().hashCode());
        return result;
    }
}