package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class MemberTypeChange implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[19 NOTNULL] 会员id*/
    private Long memberid;

    /**[2 NOTNULL] 变更前类型*/
    private String beforetype;

    /**[2 NOTNULL] 变更后类型*/
    private String aftertype;

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
     * @return  Long  会员id
     */
    public Long getMemberid() {
        return memberid;
    }

    /**
     * @param  Long[19 NOTNULL] 会员id
     */
    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    /**
     * @return  String  变更前类型
     */
    public String getBeforetype() {
        return beforetype;
    }

    /**
     * @param  String[2 NOTNULL] 变更前类型
     */
    public void setBeforetype(String beforetype) {
        this.beforetype = beforetype == null ? null : beforetype.trim();
    }

    /**
     * @return  String  变更后类型
     */
    public String getAftertype() {
        return aftertype;
    }

    /**
     * @param  String[2 NOTNULL] 变更后类型
     */
    public void setAftertype(String aftertype) {
        this.aftertype = aftertype == null ? null : aftertype.trim();
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
        MemberTypeChange other = (MemberTypeChange) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getBeforetype() == null ? other.getBeforetype() == null : this.getBeforetype().equals(other.getBeforetype()))
            && (this.getAftertype() == null ? other.getAftertype() == null : this.getAftertype().equals(other.getAftertype()))
            && (this.getChangetime() == null ? other.getChangetime() == null : this.getChangetime().equals(other.getChangetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getBeforetype() == null) ? 0 : getBeforetype().hashCode());
        result = prime * result + ((getAftertype() == null) ? 0 : getAftertype().hashCode());
        result = prime * result + ((getChangetime() == null) ? 0 : getChangetime().hashCode());
        return result;
    }
}