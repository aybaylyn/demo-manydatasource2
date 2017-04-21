package com.may.demo.entity.base;

import java.util.Date;

/**
 * Created by May on 3/3/17.
 */
public class CreateBaseDomain extends BaseDomain {
    /**
     * 创建者id
     */
    private Long creator;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 最后修改人
     */
    private Long lastModifier;
    /**
     * 最后修改时间
     */
    private Date lastModdate;

    public Integer iTotalRecords;
    public Integer sEcho;
    public Integer iTotalDisplayRecords;

    public Integer startNum;
    public Integer endNum;

    public Integer getiTotalRecords() {
        return iTotalRecords;
    }
    public void setiTotalRecords(Integer iTotalRecords) {
        this.iTotalRecords = iTotalRecords;
    }
    public Integer getsEcho() {
        return sEcho;
    }
    public void setsEcho(Integer sEcho) {
        this.sEcho = sEcho;
    }
    public Integer getiTotalDisplayRecords() {
        return iTotalDisplayRecords;
    }
    public void setiTotalDisplayRecords(Integer iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }
    public Integer getStartNum() {
        return startNum;
    }
    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }
    public Integer getEndNum() {
        return endNum;
    }
    public void setEndNum(Integer endNum) {
        this.endNum = endNum;
    }
    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(Long lastModifier) {
        this.lastModifier = lastModifier;
    }

    public Date getLastModdate() {
        return lastModdate;
    }

    public void setLastModdate(Date lastModdate) {
        this.lastModdate = lastModdate;
    }
}
