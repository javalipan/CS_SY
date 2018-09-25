package com.manage.dao.model;

import java.io.Serializable;

public class Imgs implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[1] 类型，0：品牌，1：商品*/
    private String type;

    /**[19] 业务单据ID*/
    private Long receiptid;

    /**[500] 路径*/
    private String path;

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
     * @return  String  类型，0：品牌，1：商品
     */
    public String getType() {
        return type;
    }

    /**
     * @param  String[1] 类型，0：品牌，1：商品
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return  Long  业务单据ID
     */
    public Long getReceiptid() {
        return receiptid;
    }

    /**
     * @param  Long[19] 业务单据ID
     */
    public void setReceiptid(Long receiptid) {
        this.receiptid = receiptid;
    }

    /**
     * @return  String  路径
     */
    public String getPath() {
        return path;
    }

    /**
     * @param  String[500] 路径
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
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
        Imgs other = (Imgs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getReceiptid() == null ? other.getReceiptid() == null : this.getReceiptid().equals(other.getReceiptid()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getReceiptid() == null) ? 0 : getReceiptid().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        return result;
    }
}