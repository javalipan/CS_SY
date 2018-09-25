package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class PointLog implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[19]  会员id*/
    private Long memberid;

    /**[1] 类型,0:增加，1：减少*/
    private String type;

    /**[1] 增加、减少原因，0：消费，1：注册,2:管理员添加,3:推广积分*/
    private String reason;

    /**[10] 增加、减少积分数量*/
    private Integer point;

    /**[19] 订单号，如果没有则为空*/
    private Long orderid;

    /**[19 NOTNULL] 变更时间*/
    private Date changetime;

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
     * @return  Long   会员id
     */
    public Long getMemberid() {
        return memberid;
    }

    /**
     * @param  Long[19]  会员id
     */
    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    /**
     * @return  String  类型,0:增加，1：减少
     */
    public String getType() {
        return type;
    }

    /**
     * @param  String[1] 类型,0:增加，1：减少
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return  String  增加、减少原因，0：消费，1：注册,2:管理员添加,3:推广积分
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param  String[1] 增加、减少原因，0：消费，1：注册,2:管理员添加,3:推广积分
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * @return  Integer  增加、减少积分数量
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * @param  Integer[10] 增加、减少积分数量
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * @return  Long  订单号，如果没有则为空
     */
    public Long getOrderid() {
        return orderid;
    }

    /**
     * @param  Long[19] 订单号，如果没有则为空
     */
    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    /**
     * @return  Date  变更时间
     */
    public Date getChangetime() {
        return changetime;
    }

    /**
     * @param  Date[19 NOTNULL] 变更时间
     */
    public void setChangetime(Date changetime) {
        this.changetime = changetime;
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
        PointLog other = (PointLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getPoint() == null ? other.getPoint() == null : this.getPoint().equals(other.getPoint()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getChangetime() == null ? other.getChangetime() == null : this.getChangetime().equals(other.getChangetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getPoint() == null) ? 0 : getPoint().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getChangetime() == null) ? 0 : getChangetime().hashCode());
        return result;
    }
}