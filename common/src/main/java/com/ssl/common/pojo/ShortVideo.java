package com.ssl.common.pojo;

import java.util.Date;

/**
 * 功能描述：数据库对应实体类
 *
 * @Date: 2020/8/8 20:51
 */
public class ShortVideo {
    private Integer id;
    private Integer areaId;
    private String areaName;
    private Integer projectId;
    private String projectName;
    private Integer total;
    private Date createTime;
    private Date updateTime;

    public boolean isIllegal(){
        return this.getAreaName().equals("A") ? true : false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ShortVideo{" +
                "id=" + id +
                ", areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                ", projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", total=" + total +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
