package com.FatShark.entity;

import java.io.Serializable;

/**
 * (Project)实体类
 *
 * @author makejava
 * @since 2021-11-03 07:55:50
 */
public class Project implements Serializable {
    private static final long serialVersionUID = 208195741189172121L;

    private Integer id;

    private String projectName;

    private String projectKind;

    private Object projectPrice;

    private String projectInfo;

    private Integer projectID;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectKind() {
        return projectKind;
    }

    public void setProjectKind(String projectKind) {
        this.projectKind = projectKind;
    }

    public Object getProjectPrice() {
        return projectPrice;
    }

    public void setProjectPrice(Object projectPrice) {
        this.projectPrice = projectPrice;
    }

    public String getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
    }

    public Integer getProjectID() {
        return projectID;
    }

    public void setProjectID(Integer projectID) {
        this.projectID = projectID;
    }

    public Project(Integer id, String projectName, String projectKind, Object projectPrice, String projectInfo, Integer projectID) {
        this.id = id;
        this.projectName = projectName;
        this.projectKind = projectKind;
        this.projectPrice = projectPrice;
        this.projectInfo = projectInfo;
        this.projectID = projectID;
    }

    public Project() {
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", projectKind='" + projectKind + '\'' +
                ", projectPrice=" + projectPrice +
                ", projectInfo='" + projectInfo + '\'' +
                ", projectID=" + projectID +
                '}';
    }
}