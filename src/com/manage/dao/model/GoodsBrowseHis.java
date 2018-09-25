package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class GoodsBrowseHis implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[19 NOTNULL] 会员Id*/
    private Long memberid;

    /**[19 NOTNULL] 商品id*/
    private Long goodsid;

    /**[50] ip地址*/
    private String ipaddr;

    /**[19 NOTNULL] 浏览时间*/
    private Date browsetime;

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
     * @return  Long  会员Id
     */
    public Long getMemberid() {
        return memberid;
    }

    /**
     * @param  Long[19 NOTNULL] 会员Id
     */
    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    /**
     * @return  Long  商品id
     */
    public Long getGoodsid() {
        return goodsid;
    }

    /**
     * @param  Long[19 NOTNULL] 商品id
     */
    public void setGoodsid(Long goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * @return  String  ip地址
     */
    public String getIpaddr() {
        return ipaddr;
    }

    /**
     * @param  String[50] ip地址
     */
    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr == null ? null : ipaddr.trim();
    }

    /**
     * @return  Date  浏览时间
     */
    public Date getBrowsetime() {
        return browsetime;
    }

    /**
     * @param  Date[19 NOTNULL] 浏览时间
     */
    public void setBrowsetime(Date browsetime) {
        this.browsetime = browsetime;
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
        GoodsBrowseHis other = (GoodsBrowseHis) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()))
            && (this.getIpaddr() == null ? other.getIpaddr() == null : this.getIpaddr().equals(other.getIpaddr()))
            && (this.getBrowsetime() == null ? other.getBrowsetime() == null : this.getBrowsetime().equals(other.getBrowsetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        result = prime * result + ((getIpaddr() == null) ? 0 : getIpaddr().hashCode());
        result = prime * result + ((getBrowsetime() == null) ? 0 : getBrowsetime().hashCode());
        return result;
    }
}