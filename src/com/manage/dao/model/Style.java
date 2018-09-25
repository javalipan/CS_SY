package com.manage.dao.model;

import java.io.Serializable;

public class Style implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[50 NOTNULL] 名称*/
    private String name;

    /**[19] 父级id*/
    private Long parentid;

    /**[19] 排序*/
    private Long sortno;

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
     * @return  String  名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param  String[50 NOTNULL] 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return  Long  父级id
     */
    public Long getParentid() {
        return parentid;
    }

    /**
     * @param  Long[19] 父级id
     */
    public void setParentid(Long parentid) {
        this.parentid = parentid;
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
        Style other = (Style) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getSortno() == null ? other.getSortno() == null : this.getSortno().equals(other.getSortno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getSortno() == null) ? 0 : getSortno().hashCode());
        return result;
    }
}