package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Program implements Serializable {
    /**[19 NOTNULL] 栏目id*/
    private Long id;

    /**[100] 栏目名称*/
    private String name;

    /**[19] 父级栏目id*/
    private Long parentid;

    /**[19] 排序*/
    private Long sortno;

    /**[1] 是否系统预置,0：否，1：是*/
    private String issystem;

    /**[1] 是否已删除  0未删除默认1删除*/
    private String isdelete;

    /**[500] 备注*/
    private String comments;

    /**[19] 创建时间*/
    private Date createtime;

    /**[19 NOTNULL] 最后一次更新时间*/
    private Date updatetime;

    private static final long serialVersionUID = 1L;

    /**
     * @return  Long  栏目id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param  Long[19 NOTNULL] 栏目id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return  String  栏目名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param  String[100] 栏目名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return  Long  父级栏目id
     */
    public Long getParentid() {
        return parentid;
    }

    /**
     * @param  Long[19] 父级栏目id
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

    /**
     * @return  String  是否系统预置,0：否，1：是
     */
    public String getIssystem() {
        return issystem;
    }

    /**
     * @param  String[1] 是否系统预置,0：否，1：是
     */
    public void setIssystem(String issystem) {
        this.issystem = issystem == null ? null : issystem.trim();
    }

    /**
     * @return  String  是否已删除  0未删除默认1删除
     */
    public String getIsdelete() {
        return isdelete;
    }

    /**
     * @param  String[1] 是否已删除  0未删除默认1删除
     */
    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }

    /**
     * @return  String  备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param  String[500] 备注
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * @return  Date  创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param  Date[19] 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return  Date  最后一次更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param  Date[19 NOTNULL] 最后一次更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
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
        Program other = (Program) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getSortno() == null ? other.getSortno() == null : this.getSortno().equals(other.getSortno()))
            && (this.getIssystem() == null ? other.getIssystem() == null : this.getIssystem().equals(other.getIssystem()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getSortno() == null) ? 0 : getSortno().hashCode());
        result = prime * result + ((getIssystem() == null) ? 0 : getIssystem().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }
}