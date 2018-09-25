package com.manage.dao.model;

import java.io.Serializable;

public class MemberKey implements Serializable {
    /**[36 NOTNULL] Id*/
    private String id;

    /**[10 NOTNULL] 是否合作商,0/否，1/是*/
    private Integer ispartner;

    /**[19 NOTNULL] 会员编号*/
    private Long membercode;

    private static final long serialVersionUID = 1L;

    /**
     * @return  String  Id
     */
    public String getId() {
        return id;
    }

    /**
     * @param  String[36 NOTNULL] Id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return  Integer  是否合作商,0/否，1/是
     */
    public Integer getIspartner() {
        return ispartner;
    }

    /**
     * @param  Integer[10 NOTNULL] 是否合作商,0/否，1/是
     */
    public void setIspartner(Integer ispartner) {
        this.ispartner = ispartner;
    }

    /**
     * @return  Long  会员编号
     */
    public Long getMembercode() {
        return membercode;
    }

    /**
     * @param  Long[19 NOTNULL] 会员编号
     */
    public void setMembercode(Long membercode) {
        this.membercode = membercode;
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
        MemberKey other = (MemberKey) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIspartner() == null ? other.getIspartner() == null : this.getIspartner().equals(other.getIspartner()))
            && (this.getMembercode() == null ? other.getMembercode() == null : this.getMembercode().equals(other.getMembercode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIspartner() == null) ? 0 : getIspartner().hashCode());
        result = prime * result + ((getMembercode() == null) ? 0 : getMembercode().hashCode());
        return result;
    }
}