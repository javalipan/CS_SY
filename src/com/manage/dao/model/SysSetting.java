package com.manage.dao.model;

import java.io.Serializable;

public class SysSetting implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[100 NOTNULL] key*/
    private String typekey;

    /**[500 NOTNULL] value*/
    private String typevalue;

    /**[500] remark*/
    private String remark;

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
     * @return  String  key
     */
    public String getTypekey() {
        return typekey;
    }

    /**
     * @param  String[100 NOTNULL] key
     */
    public void setTypekey(String typekey) {
        this.typekey = typekey == null ? null : typekey.trim();
    }

    /**
     * @return  String  value
     */
    public String getTypevalue() {
        return typevalue;
    }

    /**
     * @param  String[500 NOTNULL] value
     */
    public void setTypevalue(String typevalue) {
        this.typevalue = typevalue == null ? null : typevalue.trim();
    }

    /**
     * @return  String  remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param  String[500] remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        SysSetting other = (SysSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypekey() == null ? other.getTypekey() == null : this.getTypekey().equals(other.getTypekey()))
            && (this.getTypevalue() == null ? other.getTypevalue() == null : this.getTypevalue().equals(other.getTypevalue()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypekey() == null) ? 0 : getTypekey().hashCode());
        result = prime * result + ((getTypevalue() == null) ? 0 : getTypevalue().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}