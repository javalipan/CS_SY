package com.manage.dao.model;

import java.io.Serializable;

public class MemberLabel implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[19 NOTNULL] 会员id*/
    private Long memberid;

    /**[10 NOTNULL] 类型编码*/
    private String typecode;

    /**[50 NOTNULL] 类型名称*/
    private String typename;

    /**[50 NOTNULL] 标签名称*/
    private String labelname;

    /**[1 NOTNULL] 是否系统预置,0:否，1：是*/
    private String issystem;

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
     * @return  String  类型编码
     */
    public String getTypecode() {
        return typecode;
    }

    /**
     * @param  String[10 NOTNULL] 类型编码
     */
    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    /**
     * @return  String  类型名称
     */
    public String getTypename() {
        return typename;
    }

    /**
     * @param  String[50 NOTNULL] 类型名称
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    /**
     * @return  String  标签名称
     */
    public String getLabelname() {
        return labelname;
    }

    /**
     * @param  String[50 NOTNULL] 标签名称
     */
    public void setLabelname(String labelname) {
        this.labelname = labelname == null ? null : labelname.trim();
    }

    /**
     * @return  String  是否系统预置,0:否，1：是
     */
    public String getIssystem() {
        return issystem;
    }

    /**
     * @param  String[1 NOTNULL] 是否系统预置,0:否，1：是
     */
    public void setIssystem(String issystem) {
        this.issystem = issystem == null ? null : issystem.trim();
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
        MemberLabel other = (MemberLabel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getTypecode() == null ? other.getTypecode() == null : this.getTypecode().equals(other.getTypecode()))
            && (this.getTypename() == null ? other.getTypename() == null : this.getTypename().equals(other.getTypename()))
            && (this.getLabelname() == null ? other.getLabelname() == null : this.getLabelname().equals(other.getLabelname()))
            && (this.getIssystem() == null ? other.getIssystem() == null : this.getIssystem().equals(other.getIssystem()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getTypecode() == null) ? 0 : getTypecode().hashCode());
        result = prime * result + ((getTypename() == null) ? 0 : getTypename().hashCode());
        result = prime * result + ((getLabelname() == null) ? 0 : getLabelname().hashCode());
        result = prime * result + ((getIssystem() == null) ? 0 : getIssystem().hashCode());
        return result;
    }
}