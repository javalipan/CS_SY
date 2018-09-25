package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Brand implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[1 NOTNULL] 类型：0:设计师品牌，1：联名合作*/
    private String type;

    /**[50] 名称*/
    private String name;

    /**[5000] 品牌介绍*/
    private String intro;

    /**[500] 默认图片*/
    private String img;

    /**[1] 状态,0：正常，1：禁用*/
    private String status;

    /**[1] 是否推荐,0:否，1：是*/
    private String isrecomment;

    /**[10] 排序*/
    private Integer sortno;

    /**[19] 创建时间*/
    private Date createtime;

    /**[19] 更新时间*/
    private Date updatetime;

    /**[65535] detailIntro*/
    private String detailintro;

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
     * @return  String  类型：0:设计师品牌，1：联名合作
     */
    public String getType() {
        return type;
    }

    /**
     * @param  String[1 NOTNULL] 类型：0:设计师品牌，1：联名合作
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
     * @return  String  品牌介绍
     */
    public String getIntro() {
        return intro;
    }

    /**
     * @param  String[5000] 品牌介绍
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /**
     * @return  String  默认图片
     */
    public String getImg() {
        return img;
    }

    /**
     * @param  String[500] 默认图片
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * @return  String  状态,0：正常，1：禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param  String[1] 状态,0：正常，1：禁用
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return  String  是否推荐,0:否，1：是
     */
    public String getIsrecomment() {
        return isrecomment;
    }

    /**
     * @param  String[1] 是否推荐,0:否，1：是
     */
    public void setIsrecomment(String isrecomment) {
        this.isrecomment = isrecomment == null ? null : isrecomment.trim();
    }

    /**
     * @return  Integer  排序
     */
    public Integer getSortno() {
        return sortno;
    }

    /**
     * @param  Integer[10] 排序
     */
    public void setSortno(Integer sortno) {
        this.sortno = sortno;
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
     * @return  Date  更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param  Date[19] 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * @return  String  detailIntro
     */
    public String getDetailintro() {
        return detailintro;
    }

    /**
     * @param  String[65535] detailIntro
     */
    public void setDetailintro(String detailintro) {
        this.detailintro = detailintro == null ? null : detailintro.trim();
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
        Brand other = (Brand) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIntro() == null ? other.getIntro() == null : this.getIntro().equals(other.getIntro()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsrecomment() == null ? other.getIsrecomment() == null : this.getIsrecomment().equals(other.getIsrecomment()))
            && (this.getSortno() == null ? other.getSortno() == null : this.getSortno().equals(other.getSortno()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getDetailintro() == null ? other.getDetailintro() == null : this.getDetailintro().equals(other.getDetailintro()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIntro() == null) ? 0 : getIntro().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsrecomment() == null) ? 0 : getIsrecomment().hashCode());
        result = prime * result + ((getSortno() == null) ? 0 : getSortno().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getDetailintro() == null) ? 0 : getDetailintro().hashCode());
        return result;
    }
}