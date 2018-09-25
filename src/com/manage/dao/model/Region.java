package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Region implements Serializable {
    /**[10 NOTNULL] 主键标识*/
    private Integer addsid;

    /**[10 NOTNULL] 行政区划代码，国标定义标准编码*/
    private Integer code;

    /**[10] 上级代码*/
    private Integer superiorcode;

    /**[128 NOTNULL] 行政区划名称*/
    private String name;

    /**[5 NOTNULL] 类型 ：0、国家
                   10、省 11、自治州 12、直辖市 13、特别行政区 
                   20、地级市（包括普通地级市和副省级市） 21、地区 22、盟 23、自治州
                   30、县 31、自治县 32、旗 33、自治旗 34、县级市 35、市辖区 36、林区 37、特区*/
    private Short type;

    /**[5 NOTNULL] 等级 ：0、国家 1、省  2、地市 3、区县*/
    private Short level;

    /**[5 NOTNULL] 是否省会：0 否  1 是*/
    private Short isprovince;

    /**[5] 1、一级城市 2、二级城市 3、三级城市 4、四级城市 5、五级城市 */
    private Short cityclassify;

    /**[64 NOTNULL] 简称*/
    private String abb;

    /**[64 NOTNULL] 短拼*/
    private String ssp;

    /**[128 NOTNULL] 拼音*/
    private String pinyin;

    /**[10 NOTNULL] 省代码，行政区划所属省代码*/
    private Integer provincecode;

    /**[128 NOTNULL] 省名称，行政区划所属省*/
    private String provincename;

    /**[128 NOTNULL] 省拼音，行政区划所属省拼音*/
    private String provincepinyin;

    /**[10 NOTNULL] 市代码*/
    private Integer citycode;

    /**[128 NOTNULL] 市名称*/
    private String cityname;

    /**[128 NOTNULL] 市拼音*/
    private String citypinyin;

    /**[10 NOTNULL] 区代码*/
    private Integer areacode;

    /**[128 NOTNULL] 区名称*/
    private String areaname;

    /**[128 NOTNULL] 区拼音*/
    private String areapinyin;

    /**[5 NOTNULL] 状态*/
    private Short status;

    /**[10 NOTNULL] 创建人员*/
    private Integer createstaff;

    /**[19 NOTNULL] 创建时间*/
    private Date createtime;

    /**[10 NOTNULL] 修改人员*/
    private Integer updatestaff;

    /**[19 NOTNULL] 修改时间*/
    private Date updatetime;

    /**[5 NOTNULL] 是否删除*/
    private Short isdelete;

    /**[255 NOTNULL] 描述*/
    private String des;

    private static final long serialVersionUID = 1L;

    /**
     * @return  Integer  主键标识
     */
    public Integer getAddsid() {
        return addsid;
    }

    /**
     * @param  Integer[10 NOTNULL] 主键标识
     */
    public void setAddsid(Integer addsid) {
        this.addsid = addsid;
    }

    /**
     * @return  Integer  行政区划代码，国标定义标准编码
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @param  Integer[10 NOTNULL] 行政区划代码，国标定义标准编码
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * @return  Integer  上级代码
     */
    public Integer getSuperiorcode() {
        return superiorcode;
    }

    /**
     * @param  Integer[10] 上级代码
     */
    public void setSuperiorcode(Integer superiorcode) {
        this.superiorcode = superiorcode;
    }

    /**
     * @return  String  行政区划名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param  String[128 NOTNULL] 行政区划名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return  Short  类型 ：0、国家
                   10、省 11、自治州 12、直辖市 13、特别行政区 
                   20、地级市（包括普通地级市和副省级市） 21、地区 22、盟 23、自治州
                   30、县 31、自治县 32、旗 33、自治旗 34、县级市 35、市辖区 36、林区 37、特区
     */
    public Short getType() {
        return type;
    }

    /**
     * @param  Short[5 NOTNULL] 类型 ：0、国家
                   10、省 11、自治州 12、直辖市 13、特别行政区 
                   20、地级市（包括普通地级市和副省级市） 21、地区 22、盟 23、自治州
                   30、县 31、自治县 32、旗 33、自治旗 34、县级市 35、市辖区 36、林区 37、特区
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * @return  Short  等级 ：0、国家 1、省  2、地市 3、区县
     */
    public Short getLevel() {
        return level;
    }

    /**
     * @param  Short[5 NOTNULL] 等级 ：0、国家 1、省  2、地市 3、区县
     */
    public void setLevel(Short level) {
        this.level = level;
    }

    /**
     * @return  Short  是否省会：0 否  1 是
     */
    public Short getIsprovince() {
        return isprovince;
    }

    /**
     * @param  Short[5 NOTNULL] 是否省会：0 否  1 是
     */
    public void setIsprovince(Short isprovince) {
        this.isprovince = isprovince;
    }

    /**
     * @return  Short  1、一级城市 2、二级城市 3、三级城市 4、四级城市 5、五级城市 
     */
    public Short getCityclassify() {
        return cityclassify;
    }

    /**
     * @param  Short[5] 1、一级城市 2、二级城市 3、三级城市 4、四级城市 5、五级城市 
     */
    public void setCityclassify(Short cityclassify) {
        this.cityclassify = cityclassify;
    }

    /**
     * @return  String  简称
     */
    public String getAbb() {
        return abb;
    }

    /**
     * @param  String[64 NOTNULL] 简称
     */
    public void setAbb(String abb) {
        this.abb = abb == null ? null : abb.trim();
    }

    /**
     * @return  String  短拼
     */
    public String getSsp() {
        return ssp;
    }

    /**
     * @param  String[64 NOTNULL] 短拼
     */
    public void setSsp(String ssp) {
        this.ssp = ssp == null ? null : ssp.trim();
    }

    /**
     * @return  String  拼音
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * @param  String[128 NOTNULL] 拼音
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    /**
     * @return  Integer  省代码，行政区划所属省代码
     */
    public Integer getProvincecode() {
        return provincecode;
    }

    /**
     * @param  Integer[10 NOTNULL] 省代码，行政区划所属省代码
     */
    public void setProvincecode(Integer provincecode) {
        this.provincecode = provincecode;
    }

    /**
     * @return  String  省名称，行政区划所属省
     */
    public String getProvincename() {
        return provincename;
    }

    /**
     * @param  String[128 NOTNULL] 省名称，行政区划所属省
     */
    public void setProvincename(String provincename) {
        this.provincename = provincename == null ? null : provincename.trim();
    }

    /**
     * @return  String  省拼音，行政区划所属省拼音
     */
    public String getProvincepinyin() {
        return provincepinyin;
    }

    /**
     * @param  String[128 NOTNULL] 省拼音，行政区划所属省拼音
     */
    public void setProvincepinyin(String provincepinyin) {
        this.provincepinyin = provincepinyin == null ? null : provincepinyin.trim();
    }

    /**
     * @return  Integer  市代码
     */
    public Integer getCitycode() {
        return citycode;
    }

    /**
     * @param  Integer[10 NOTNULL] 市代码
     */
    public void setCitycode(Integer citycode) {
        this.citycode = citycode;
    }

    /**
     * @return  String  市名称
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * @param  String[128 NOTNULL] 市名称
     */
    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    /**
     * @return  String  市拼音
     */
    public String getCitypinyin() {
        return citypinyin;
    }

    /**
     * @param  String[128 NOTNULL] 市拼音
     */
    public void setCitypinyin(String citypinyin) {
        this.citypinyin = citypinyin == null ? null : citypinyin.trim();
    }

    /**
     * @return  Integer  区代码
     */
    public Integer getAreacode() {
        return areacode;
    }

    /**
     * @param  Integer[10 NOTNULL] 区代码
     */
    public void setAreacode(Integer areacode) {
        this.areacode = areacode;
    }

    /**
     * @return  String  区名称
     */
    public String getAreaname() {
        return areaname;
    }

    /**
     * @param  String[128 NOTNULL] 区名称
     */
    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    /**
     * @return  String  区拼音
     */
    public String getAreapinyin() {
        return areapinyin;
    }

    /**
     * @param  String[128 NOTNULL] 区拼音
     */
    public void setAreapinyin(String areapinyin) {
        this.areapinyin = areapinyin == null ? null : areapinyin.trim();
    }

    /**
     * @return  Short  状态
     */
    public Short getStatus() {
        return status;
    }

    /**
     * @param  Short[5 NOTNULL] 状态
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * @return  Integer  创建人员
     */
    public Integer getCreatestaff() {
        return createstaff;
    }

    /**
     * @param  Integer[10 NOTNULL] 创建人员
     */
    public void setCreatestaff(Integer createstaff) {
        this.createstaff = createstaff;
    }

    /**
     * @return  Date  创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param  Date[19 NOTNULL] 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return  Integer  修改人员
     */
    public Integer getUpdatestaff() {
        return updatestaff;
    }

    /**
     * @param  Integer[10 NOTNULL] 修改人员
     */
    public void setUpdatestaff(Integer updatestaff) {
        this.updatestaff = updatestaff;
    }

    /**
     * @return  Date  修改时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param  Date[19 NOTNULL] 修改时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * @return  Short  是否删除
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * @param  Short[5 NOTNULL] 是否删除
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * @return  String  描述
     */
    public String getDes() {
        return des;
    }

    /**
     * @param  String[255 NOTNULL] 描述
     */
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
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
        Region other = (Region) that;
        return (this.getAddsid() == null ? other.getAddsid() == null : this.getAddsid().equals(other.getAddsid()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getSuperiorcode() == null ? other.getSuperiorcode() == null : this.getSuperiorcode().equals(other.getSuperiorcode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getIsprovince() == null ? other.getIsprovince() == null : this.getIsprovince().equals(other.getIsprovince()))
            && (this.getCityclassify() == null ? other.getCityclassify() == null : this.getCityclassify().equals(other.getCityclassify()))
            && (this.getAbb() == null ? other.getAbb() == null : this.getAbb().equals(other.getAbb()))
            && (this.getSsp() == null ? other.getSsp() == null : this.getSsp().equals(other.getSsp()))
            && (this.getPinyin() == null ? other.getPinyin() == null : this.getPinyin().equals(other.getPinyin()))
            && (this.getProvincecode() == null ? other.getProvincecode() == null : this.getProvincecode().equals(other.getProvincecode()))
            && (this.getProvincename() == null ? other.getProvincename() == null : this.getProvincename().equals(other.getProvincename()))
            && (this.getProvincepinyin() == null ? other.getProvincepinyin() == null : this.getProvincepinyin().equals(other.getProvincepinyin()))
            && (this.getCitycode() == null ? other.getCitycode() == null : this.getCitycode().equals(other.getCitycode()))
            && (this.getCityname() == null ? other.getCityname() == null : this.getCityname().equals(other.getCityname()))
            && (this.getCitypinyin() == null ? other.getCitypinyin() == null : this.getCitypinyin().equals(other.getCitypinyin()))
            && (this.getAreacode() == null ? other.getAreacode() == null : this.getAreacode().equals(other.getAreacode()))
            && (this.getAreaname() == null ? other.getAreaname() == null : this.getAreaname().equals(other.getAreaname()))
            && (this.getAreapinyin() == null ? other.getAreapinyin() == null : this.getAreapinyin().equals(other.getAreapinyin()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreatestaff() == null ? other.getCreatestaff() == null : this.getCreatestaff().equals(other.getCreatestaff()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatestaff() == null ? other.getUpdatestaff() == null : this.getUpdatestaff().equals(other.getUpdatestaff()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()))
            && (this.getDes() == null ? other.getDes() == null : this.getDes().equals(other.getDes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddsid() == null) ? 0 : getAddsid().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getSuperiorcode() == null) ? 0 : getSuperiorcode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getIsprovince() == null) ? 0 : getIsprovince().hashCode());
        result = prime * result + ((getCityclassify() == null) ? 0 : getCityclassify().hashCode());
        result = prime * result + ((getAbb() == null) ? 0 : getAbb().hashCode());
        result = prime * result + ((getSsp() == null) ? 0 : getSsp().hashCode());
        result = prime * result + ((getPinyin() == null) ? 0 : getPinyin().hashCode());
        result = prime * result + ((getProvincecode() == null) ? 0 : getProvincecode().hashCode());
        result = prime * result + ((getProvincename() == null) ? 0 : getProvincename().hashCode());
        result = prime * result + ((getProvincepinyin() == null) ? 0 : getProvincepinyin().hashCode());
        result = prime * result + ((getCitycode() == null) ? 0 : getCitycode().hashCode());
        result = prime * result + ((getCityname() == null) ? 0 : getCityname().hashCode());
        result = prime * result + ((getCitypinyin() == null) ? 0 : getCitypinyin().hashCode());
        result = prime * result + ((getAreacode() == null) ? 0 : getAreacode().hashCode());
        result = prime * result + ((getAreaname() == null) ? 0 : getAreaname().hashCode());
        result = prime * result + ((getAreapinyin() == null) ? 0 : getAreapinyin().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreatestaff() == null) ? 0 : getCreatestaff().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatestaff() == null) ? 0 : getUpdatestaff().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        result = prime * result + ((getDes() == null) ? 0 : getDes().hashCode());
        return result;
    }
}