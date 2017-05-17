package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class BaseLocation extends BaseEntity implements Serializable {
    /**
     *  ,所属表字段为base_location.deleteFlag
     */
    private String deleteflag;

    /**
     *  创建时间,所属表字段为base_location.createTime
     */
    private Date createtime;

    /**
     *  中文名称,所属表字段为base_location.nameCN
     */
    private String namecn;

    /**
     *  英文名称,所属表字段为base_location.nameEN
     */
    private String nameen;

    /**
     *  编码,所属表字段为base_location.code
     */
    private String code;

    /**
     *  快速录入码,所属表字段为base_location.inputCode
     */
    private String inputcode;

    /**
     *  语言类型,所属表字段为base_location.languageType
     */
    private String languagetype;

    /**
     *  地点级别,所属表字段为base_location.level
     */
    private Integer level;

    /**
     *  全拼,所属表字段为base_location.longName
     */
    private String longname;

    /**
     *  上级代码,所属表字段为base_location.parentId
     */
    private Integer parentid;

    /**
     *  邮编,所属表字段为base_location.zipCode
     */
    private String zipcode;

    /**
     *  首字母,所属表字段为base_location.shortName
     */
    private String shortname;

    /**
     *  排序号,所属表字段为base_location.orderNo
     */
    private String orderno;

    /**
     *  预留字段,所属表字段为base_location.substr1
     */
    private String substr1;

    /**
     *  预留字段,所属表字段为base_location.substr2
     */
    private String substr2;

    /**
     *  预留字段,所属表字段为base_location.subdouble1
     */
    private Double subdouble1;

    /**
     *  预留字段,所属表字段为base_location.subdouble2
     */
    private Double subdouble2;

    /**
     *  预留字段,所属表字段为base_location.subdate1
     */
    private Date subdate1;

    /**
     *  预留字段,所属表字段为base_location.subdate2
     */
    private Date subdate2;

    /**
     *  创建人ID,所属表字段为base_location.creator
     */
    private String creator;

    /**
     *  创建人,所属表字段为base_location.createName
     */
    private String createname;

    /**
     *  修改人ID,所属表字段为base_location.modifier
     */
    private String modifier;

    /**
     *  修改人,所属表字段为base_location.modifyName
     */
    private String modifyname;

    /**
     *  修改时间,所属表字段为base_location.modifyTime
     */
    private Date modifytime;

    /**
     *  是否常用,所属表字段为base_location.isOften
     */
    private String isoften;

    private static final long serialVersionUID = 1L;

    public String getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNamecn() {
        return namecn;
    }

    public void setNamecn(String namecn) {
        this.namecn = namecn;
    }

    public String getNameen() {
        return nameen;
    }

    public void setNameen(String nameen) {
        this.nameen = nameen;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInputcode() {
        return inputcode;
    }

    public void setInputcode(String inputcode) {
        this.inputcode = inputcode;
    }

    public String getLanguagetype() {
        return languagetype;
    }

    public void setLanguagetype(String languagetype) {
        this.languagetype = languagetype;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLongname() {
        return longname;
    }

    public void setLongname(String longname) {
        this.longname = longname;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getSubstr1() {
        return substr1;
    }

    public void setSubstr1(String substr1) {
        this.substr1 = substr1;
    }

    public String getSubstr2() {
        return substr2;
    }

    public void setSubstr2(String substr2) {
        this.substr2 = substr2;
    }

    public Double getSubdouble1() {
        return subdouble1;
    }

    public void setSubdouble1(Double subdouble1) {
        this.subdouble1 = subdouble1;
    }

    public Double getSubdouble2() {
        return subdouble2;
    }

    public void setSubdouble2(Double subdouble2) {
        this.subdouble2 = subdouble2;
    }

    public Date getSubdate1() {
        return subdate1;
    }

    public void setSubdate1(Date subdate1) {
        this.subdate1 = subdate1;
    }

    public Date getSubdate2() {
        return subdate2;
    }

    public void setSubdate2(Date subdate2) {
        this.subdate2 = subdate2;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifyname() {
        return modifyname;
    }

    public void setModifyname(String modifyname) {
        this.modifyname = modifyname;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getIsoften() {
        return isoften;
    }

    public void setIsoften(String isoften) {
        this.isoften = isoften;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deleteflag=").append(deleteflag);
        sb.append(", createtime=").append(createtime);
        sb.append(", namecn=").append(namecn);
        sb.append(", nameen=").append(nameen);
        sb.append(", code=").append(code);
        sb.append(", inputcode=").append(inputcode);
        sb.append(", languagetype=").append(languagetype);
        sb.append(", level=").append(level);
        sb.append(", longname=").append(longname);
        sb.append(", parentid=").append(parentid);
        sb.append(", zipcode=").append(zipcode);
        sb.append(", shortname=").append(shortname);
        sb.append(", orderno=").append(orderno);
        sb.append(", substr1=").append(substr1);
        sb.append(", substr2=").append(substr2);
        sb.append(", subdouble1=").append(subdouble1);
        sb.append(", subdouble2=").append(subdouble2);
        sb.append(", subdate1=").append(subdate1);
        sb.append(", subdate2=").append(subdate2);
        sb.append(", creator=").append(creator);
        sb.append(", createname=").append(createname);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyname=").append(modifyname);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", isoften=").append(isoften);
        sb.append("]");
        return sb.toString();
    }
}