package com.manage.dao.model;

import java.io.Serializable;

public class Role implements Serializable {
    /**[36 NOTNULL] id*/
    private String id;

    /**[50 NOTNULL] 色角名称*/
    private String name;

    /**[10 NOTNULL] 角色类型(码表值:ROLETYPE）*/
    private String type;

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
     * @return  String  色角名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param  String[50 NOTNULL] 色角名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return  String  角色类型(码表值:ROLETYPE）
     */
    public String getType() {
        return type;
    }

    /**
     * @param  String[10 NOTNULL] 角色类型(码表值:ROLETYPE）
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
        Role other = (Role) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }
}