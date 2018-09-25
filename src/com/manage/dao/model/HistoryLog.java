package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HistoryLog implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[36 NOTNULL] 用户id*/
    private String userid;

    /**[19 NOTNULL] 操作时间*/
    private Date operatetime;

    /**[1 NOTNULL] 日志类型，0:登录日志,1:操作日志*/
    private String logtype;

    /**[10 NOTNULL] ip地址*/
    private String ipaddress;

    /**[1 NOTNULL] 操作类型，增删改查*/
    private String operatetype;

    /**[5000] 操作内容*/
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
     * @return  Date  操作时间
     */
    public Date getOperatetime() {
        return operatetime;
    }

    /**
     * @param  Date[19 NOTNULL] 操作时间
     */
    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    /**
     * @return  String  日志类型，0:登录日志,1:操作日志
     */
    public String getLogtype() {
        return logtype;
    }

    /**
     * @param  String[1 NOTNULL] 日志类型，0:登录日志,1:操作日志
     */
    public void setLogtype(String logtype) {
        this.logtype = logtype == null ? null : logtype.trim();
    }

    /**
     * @return  String  ip地址
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * @param  String[10 NOTNULL] ip地址
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    /**
     * @return  String  操作类型，增删改查
     */
    public String getOperatetype() {
        return operatetype;
    }

    /**
     * @param  String[1 NOTNULL] 操作类型，增删改查
     */
    public void setOperatetype(String operatetype) {
        this.operatetype = operatetype == null ? null : operatetype.trim();
    }

    /**
     * @return  String  操作内容
     */
    public String getContent() {
        return content;
    }

    /**
     * @param  String[5000] 操作内容
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
        HistoryLog other = (HistoryLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getOperatetime() == null ? other.getOperatetime() == null : this.getOperatetime().equals(other.getOperatetime()))
            && (this.getLogtype() == null ? other.getLogtype() == null : this.getLogtype().equals(other.getLogtype()))
            && (this.getIpaddress() == null ? other.getIpaddress() == null : this.getIpaddress().equals(other.getIpaddress()))
            && (this.getOperatetype() == null ? other.getOperatetype() == null : this.getOperatetype().equals(other.getOperatetype()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getOperatetime() == null) ? 0 : getOperatetime().hashCode());
        result = prime * result + ((getLogtype() == null) ? 0 : getLogtype().hashCode());
        result = prime * result + ((getIpaddress() == null) ? 0 : getIpaddress().hashCode());
        result = prime * result + ((getOperatetype() == null) ? 0 : getOperatetype().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}