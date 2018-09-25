package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Code implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[50] 分类编号*/
    private String typecode;

    /**[50] 编号*/
    private String code;

    /**[50] 分类名称*/
    private String typename;

    /**[50] 名称*/
    private String name;

    /**[20] 名称简拼*/
    private String namesimple;

    /**[19] 排序,降序排序*/
    private Long sortno;

    /**[32] 父级id*/
    private String parentid;

    /**[500] 备注*/
    private String comments;

    /**[1] 是否作废 0正常(默认) 1作废*/
    private String isvoid;

    /**[19] 创建时间*/
    private Date createtime;

    /**[19 NOTNULL] 最后一次更新时间*/
    private Date updatetime;

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
     * @return  String  分类编号
     */
    public String getTypecode() {
        return typecode;
    }

    /**
     * @param  String[50] 分类编号
     */
    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    /**
     * @return  String  编号
     */
    public String getCode() {
        return code;
    }

    /**
     * @param  String[50] 编号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * @return  String  分类名称
     */
    public String getTypename() {
        return typename;
    }

    /**
     * @param  String[50] 分类名称
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    /**
     * @return  String  名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param  String[50] 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return  String  名称简拼
     */
    public String getNamesimple() {
        return namesimple;
    }

    /**
     * @param  String[20] 名称简拼
     */
    public void setNamesimple(String namesimple) {
        this.namesimple = namesimple == null ? null : namesimple.trim();
    }

    /**
     * @return  Long  排序,降序排序
     */
    public Long getSortno() {
        return sortno;
    }

    /**
     * @param  Long[19] 排序,降序排序
     */
    public void setSortno(Long sortno) {
        this.sortno = sortno;
    }

    /**
     * @return  String  父级id
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * @param  String[32] 父级id
     */
    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
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
     * @return  String  是否作废 0正常(默认) 1作废
     */
    public String getIsvoid() {
        return isvoid;
    }

    /**
     * @param  String[1] 是否作废 0正常(默认) 1作废
     */
    public void setIsvoid(String isvoid) {
        this.isvoid = isvoid == null ? null : isvoid.trim();
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
        Code other = (Code) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypecode() == null ? other.getTypecode() == null : this.getTypecode().equals(other.getTypecode()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getTypename() == null ? other.getTypename() == null : this.getTypename().equals(other.getTypename()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNamesimple() == null ? other.getNamesimple() == null : this.getNamesimple().equals(other.getNamesimple()))
            && (this.getSortno() == null ? other.getSortno() == null : this.getSortno().equals(other.getSortno()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()))
            && (this.getIsvoid() == null ? other.getIsvoid() == null : this.getIsvoid().equals(other.getIsvoid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypecode() == null) ? 0 : getTypecode().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getTypename() == null) ? 0 : getTypename().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNamesimple() == null) ? 0 : getNamesimple().hashCode());
        result = prime * result + ((getSortno() == null) ? 0 : getSortno().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
        result = prime * result + ((getIsvoid() == null) ? 0 : getIsvoid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }
}