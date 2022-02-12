package com.FatShark.entity;

import java.io.Serializable;

/**
 * (Shop)实体类
 *
 * @author makejava
 * @since 2021-11-03 07:56:04
 */
public class Shop implements Serializable {
    private static final long serialVersionUID = -34756256956619046L;

    private int id;
    private String shopID;
    private String shopName;
    private String shopAddress;
    private int shopProjectID;
    private User user;
    private Project project;

    public Shop(int id, String shopID, String shopName, String shopAddress, int shopProjectID, User user, Project project) {
        this.id = id;
        this.shopID = shopID;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopProjectID = shopProjectID;
        this.user = user;
        this.project = project;
    }

    public Shop() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopID() {
        return shopID;
    }

    public void setShopID(String shopID) {
        this.shopID = shopID;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public int getShopProjectID() {
        return shopProjectID;
    }

    public void setShopProjectID(int shopProjectID) {
        this.shopProjectID = shopProjectID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", shopID='" + shopID + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", shopProjectID='" + shopProjectID + '\'' +
                ", user=" + user +
                ", project=" + project +
                '}';
    }
}