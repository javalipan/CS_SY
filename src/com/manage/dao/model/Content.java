package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Content implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[19] 所属栏目id*/
    private Long programid;

    /**[100] 标题*/
    private String title;

    /**[200] 副标题*/
    private String subtitle;

    /**[500] 内容图片,关联附件表*/
    private String img;

    /**[19] 生效时间起*/
    private Date starttime;

    /**[19] 生效时间止*/
    private Date endtime;

    /**[19] 点击量*/
    private Long hits;

    /**[19] 排序*/
    private Long sortno;

    /**[500] 备注*/
    private String comments;

    /**[19] 创建时间*/
    private Date createtime;

    /**[19 NOTNULL] 最后一次更新时间*/
    private Date updatetime;

    /**[1000] url*/
    private String url;

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
     * @return  Long  所属栏目id
     */
    public Long getProgramid() {
        return programid;
    }

    /**
     * @param  Long[19] 所属栏目id
     */
    public void setProgramid(Long programid) {
        this.programid = programid;
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
     * @return  String  副标题
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * @param  String[200] 副标题
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
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
     * @return  Date  生效时间起
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * @param  Date[19] 生效时间起
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * @return  Date  生效时间止
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * @param  Date[19] 生效时间止
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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

    /**
     * @return  String  url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param  String[1000] url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
        Content other = (Content) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProgramid() == null ? other.getProgramid() == null : this.getProgramid().equals(other.getProgramid()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSubtitle() == null ? other.getSubtitle() == null : this.getSubtitle().equals(other.getSubtitle()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getHits() == null ? other.getHits() == null : this.getHits().equals(other.getHits()))
            && (this.getSortno() == null ? other.getSortno() == null : this.getSortno().equals(other.getSortno()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProgramid() == null) ? 0 : getProgramid().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getHits() == null) ? 0 : getHits().hashCode());
        result = prime * result + ((getSortno() == null) ? 0 : getSortno().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}