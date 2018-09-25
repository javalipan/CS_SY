package com.manage.dao.model;

import java.io.Serializable;

public class LevelSetting implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[100] 等级图标*/
    private String icon;

    /**[10] 起*/
    private Integer levelstart;

    /**[10] 止*/
    private Integer levelend;

    /**[10] 等级*/
    private Integer grade;

    /**[50] 等级名称*/
    private String gradename;

    /**[12] 积分获取速度*/
    private Float pointspeed;

    /**[22] 折扣*/
    private Double discount;

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
     * @return  String  等级图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param  String[100] 等级图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * @return  Integer  起
     */
    public Integer getLevelstart() {
        return levelstart;
    }

    /**
     * @param  Integer[10] 起
     */
    public void setLevelstart(Integer levelstart) {
        this.levelstart = levelstart;
    }

    /**
     * @return  Integer  止
     */
    public Integer getLevelend() {
        return levelend;
    }

    /**
     * @param  Integer[10] 止
     */
    public void setLevelend(Integer levelend) {
        this.levelend = levelend;
    }

    /**
     * @return  Integer  等级
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * @param  Integer[10] 等级
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * @return  String  等级名称
     */
    public String getGradename() {
        return gradename;
    }

    /**
     * @param  String[50] 等级名称
     */
    public void setGradename(String gradename) {
        this.gradename = gradename == null ? null : gradename.trim();
    }

    /**
     * @return  Float  积分获取速度
     */
    public Float getPointspeed() {
        return pointspeed;
    }

    /**
     * @param  Float[12] 积分获取速度
     */
    public void setPointspeed(Float pointspeed) {
        this.pointspeed = pointspeed;
    }

    /**
     * @return  Double  折扣
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param  Double[22] 折扣
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
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
        LevelSetting other = (LevelSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getLevelstart() == null ? other.getLevelstart() == null : this.getLevelstart().equals(other.getLevelstart()))
            && (this.getLevelend() == null ? other.getLevelend() == null : this.getLevelend().equals(other.getLevelend()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getGradename() == null ? other.getGradename() == null : this.getGradename().equals(other.getGradename()))
            && (this.getPointspeed() == null ? other.getPointspeed() == null : this.getPointspeed().equals(other.getPointspeed()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getLevelstart() == null) ? 0 : getLevelstart().hashCode());
        result = prime * result + ((getLevelend() == null) ? 0 : getLevelend().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getGradename() == null) ? 0 : getGradename().hashCode());
        result = prime * result + ((getPointspeed() == null) ? 0 : getPointspeed().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        return result;
    }
}