package com.manage.dao.model;

import java.io.Serializable;

public class Spec implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[10] 编码*/
    private String code;

    /**[50] 类型名称*/
    private String typename;

    /**[20] 类型编码*/
    private String typecode;

    /**[50] 规格值*/
    private String specvalue;

    /**[19] 排序*/
    private Long sortno;

    /**[1] 类型，保留字段*/
    private String type;

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
     * @return  String  编码
     */
    public String getCode() {
        return code;
    }

    /**
     * @param  String[10] 编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * @return  String  类型名称
     */
    public String getTypename() {
        return typename;
    }

    /**
     * @param  String[50] 类型名称
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    /**
     * @return  String  类型编码
     */
    public String getTypecode() {
        return typecode;
    }

    /**
     * @param  String[20] 类型编码
     */
    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    /**
     * @return  String  规格值
     */
    public String getSpecvalue() {
        return specvalue;
    }

    /**
     * @param  String[50] 规格值
     */
    public void setSpecvalue(String specvalue) {
        this.specvalue = specvalue == null ? null : specvalue.trim();
    }

    /**
     * @return  Long  排序
     */
    public Long getSortno() {
        return sortno;
    }

    /**
     * @param  Long[19] 排序
     */
    public void setSortno(Long sortno) {
        this.sortno = sortno;
    }

    /**
     * @return  String  类型，保留字段
     */
    public String getType() {
        return type;
    }

    /**
     * @param  String[1] 类型，保留字段
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
        Spec other = (Spec) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getTypename() == null ? other.getTypename() == null : this.getTypename().equals(other.getTypename()))
            && (this.getTypecode() == null ? other.getTypecode() == null : this.getTypecode().equals(other.getTypecode()))
            && (this.getSpecvalue() == null ? other.getSpecvalue() == null : this.getSpecvalue().equals(other.getSpecvalue()))
            && (this.getSortno() == null ? other.getSortno() == null : this.getSortno().equals(other.getSortno()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getTypename() == null) ? 0 : getTypename().hashCode());
        result = prime * result + ((getTypecode() == null) ? 0 : getTypecode().hashCode());
        result = prime * result + ((getSpecvalue() == null) ? 0 : getSpecvalue().hashCode());
        result = prime * result + ((getSortno() == null) ? 0 : getSortno().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }
}