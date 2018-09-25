package com.manage.dao.model;

import java.io.Serializable;

public class RoleMenu implements Serializable {
    /**[36 NOTNULL] id*/
    private String id;

    /**[36 NOTNULL] 角色id*/
    private String roleid;

    /**[36 NOTNULL] 菜单id*/
    private String menuid;

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
     * @return  String  角色id
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * @param  String[36 NOTNULL] 角色id
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    /**
     * @return  String  菜单id
     */
    public String getMenuid() {
        return menuid;
    }

    /**
     * @param  String[36 NOTNULL] 菜单id
     */
    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
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
        RoleMenu other = (RoleMenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getMenuid() == null ? other.getMenuid() == null : this.getMenuid().equals(other.getMenuid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getMenuid() == null) ? 0 : getMenuid().hashCode());
        return result;
    }
}