package com.manage.dao.model;

import java.io.Serializable;

public class UserRole implements Serializable {
    /**[36 NOTNULL] id*/
    private String id;

    /**[36 NOTNULL] 用户id*/
    private String userid;

    /**[36 NOTNULL] 色角id*/
    private String roleid;

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
     * @return  String  用户id
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param  String[36 NOTNULL] 用户id
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * @return  String  色角id
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * @param  String[36 NOTNULL] 色角id
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
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
        UserRole other = (UserRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        return result;
    }
}