package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Cooperate implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[100] 标题*/
    private String title;

    /**[500] 内容图片,关联附件表*/
    private String img;

    /**[19] 点击量*/
    private Long hits;

    /**[19] 排序*/
    private Long sortno;

    /**[19] 创建时间*/
    private Date createtime;

    /**[19 NOTNULL] 最后一次更新时间*/
    private Date updatetime;

    /**[65535] 内容*/
    private String content;

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
     * @return  String  标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param  String[100] 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return  String  内容图片,关联附件表
     */
    public String getImg() {
        return img;
    }

    /**
     * @param  String[500] 内容图片,关联附件表
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * @return  Long  点击量
     */
    public Long getHits() {
        return hits;
    }

    /**
     * @param  Long[19] 点击量
     */
    public void setHits(Long hits) {
        this.hits = hits;
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

    /**
     * @return  String  内容
     */
    public String getContent() {
        return content;
    }

    /**
     * @param  String[65535] 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        Cooperate other = (Cooperate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getHits() == null ? other.getHits() == null : this.getHits().equals(other.getHits()))
            && (this.getSortno() == null ? other.getSortno() == null : this.getSortno().equals(other.getSortno()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getHits() == null) ? 0 : getHits().hashCode());
        result = prime * result + ((getSortno() == null) ? 0 : getSortno().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}