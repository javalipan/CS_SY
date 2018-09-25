package com.manage.dao.model;

import java.io.Serializable;

public class Menu implements Serializable {
    /**[36 NOTNULL] id*/
    private String id;

    /**[50 NOTNULL] 菜单名称*/
    private String name;

    /**[1 NOTNULL] 菜单类型（1:管理菜单,2:前台菜单）*/
    private String type;

    /**[500] 菜单url*/
    private String url;

    /**[50] 菜单图标*/
    private String icon;

    /**[36] 父级菜单id*/
    private String pid;

    /**[5] 排序*/
    private String sortby;

    /**[1 NOTNULL] 状态（0:正常,1:禁用）*/
    private String status;

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
     * @return  String  菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param  String[50 NOTNULL] 菜单名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return  String  菜单类型（1:管理菜单,2:前台菜单）
     */
    public String getType() {
        return type;
    }

    /**
     * @param  String[1 NOTNULL] 菜单类型（1:管理菜单,2:前台菜单）
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return  String  菜单url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param  String[500] 菜单url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * @return  String  菜单图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param  String[50] 菜单图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * @return  String  父级菜单id
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param  String[36] 父级菜单id
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * @return  String  排序
     */
    public String getSortby() {
        return sortby;
    }

    /**
     * @param  String[5] 排序
     */
    public void setSortby(String sortby) {
        this.sortby = sortby == null ? null : sortby.trim();
    }

    /**
     * @return  String  状态（0:正常,1:禁用）
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param  String[1 NOTNULL] 状态（0:正常,1:禁用）
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        Menu other = (Menu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getSortby() == null ? other.getSortby() == null : this.getSortby().equals(other.getSortby()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getSortby() == null) ? 0 : getSortby().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}