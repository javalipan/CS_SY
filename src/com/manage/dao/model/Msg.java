package com.manage.dao.model;

import java.io.Serializable;

public class Msg implements Serializable {
    /**[36 NOTNULL] id*/
    private String id;

    /**[200 NOTNULL] 标题*/
    private String title;

    /**[20] 消息类型(1:文字消息;2:图片消息;3:视频消息;4:小视频消息;5:位置消息;6:收到链接;7:订阅;8:取消订阅;9:点击菜单;10:点击链接菜单)*/
    private String msgtype;

    /**[200] 图片地址*/
    private String picaddr;

    /**[200] 图片*/
    private String pic;

    /**[10] 内容类型(1:链接;2:富文本)*/
    private String contenttype;

    /**[500] linkaddr*/
    private String linkaddr;

    /**[3500] 内容*/
    private String content;

    /**[10] 排序号*/
    private String fdorder;

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
     * @return  String  标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param  String[200 NOTNULL] 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return  String  消息类型(1:文字消息;2:图片消息;3:视频消息;4:小视频消息;5:位置消息;6:收到链接;7:订阅;8:取消订阅;9:点击菜单;10:点击链接菜单)
     */
    public String getMsgtype() {
        return msgtype;
    }

    /**
     * @param  String[20] 消息类型(1:文字消息;2:图片消息;3:视频消息;4:小视频消息;5:位置消息;6:收到链接;7:订阅;8:取消订阅;9:点击菜单;10:点击链接菜单)
     */
    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype == null ? null : msgtype.trim();
    }

    /**
     * @return  String  图片地址
     */
    public String getPicaddr() {
        return picaddr;
    }

    /**
     * @param  String[200] 图片地址
     */
    public void setPicaddr(String picaddr) {
        this.picaddr = picaddr == null ? null : picaddr.trim();
    }

    /**
     * @return  String  图片
     */
    public String getPic() {
        return pic;
    }

    /**
     * @param  String[200] 图片
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * @return  String  内容类型(1:链接;2:富文本)
     */
    public String getContenttype() {
        return contenttype;
    }

    /**
     * @param  String[10] 内容类型(1:链接;2:富文本)
     */
    public void setContenttype(String contenttype) {
        this.contenttype = contenttype == null ? null : contenttype.trim();
    }

    /**
     * @return  String  linkaddr
     */
    public String getLinkaddr() {
        return linkaddr;
    }

    /**
     * @param  String[500] linkaddr
     */
    public void setLinkaddr(String linkaddr) {
        this.linkaddr = linkaddr == null ? null : linkaddr.trim();
    }

    /**
     * @return  String  内容
     */
    public String getContent() {
        return content;
    }

    /**
     * @param  String[3500] 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * @return  String  排序号
     */
    public String getFdorder() {
        return fdorder;
    }

    /**
     * @param  String[10] 排序号
     */
    public void setFdorder(String fdorder) {
        this.fdorder = fdorder == null ? null : fdorder.trim();
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
        Msg other = (Msg) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getMsgtype() == null ? other.getMsgtype() == null : this.getMsgtype().equals(other.getMsgtype()))
            && (this.getPicaddr() == null ? other.getPicaddr() == null : this.getPicaddr().equals(other.getPicaddr()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getContenttype() == null ? other.getContenttype() == null : this.getContenttype().equals(other.getContenttype()))
            && (this.getLinkaddr() == null ? other.getLinkaddr() == null : this.getLinkaddr().equals(other.getLinkaddr()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getFdorder() == null ? other.getFdorder() == null : this.getFdorder().equals(other.getFdorder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getMsgtype() == null) ? 0 : getMsgtype().hashCode());
        result = prime * result + ((getPicaddr() == null) ? 0 : getPicaddr().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getContenttype() == null) ? 0 : getContenttype().hashCode());
        result = prime * result + ((getLinkaddr() == null) ? 0 : getLinkaddr().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getFdorder() == null) ? 0 : getFdorder().hashCode());
        return result;
    }
}