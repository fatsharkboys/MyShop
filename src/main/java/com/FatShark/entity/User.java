package com.FatShark.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2021-11-02 20:39:33
 */
public class User implements Serializable {
    private static final long serialVersionUID = -35481269314350040L;
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String address;
    private Integer shopID;
    private String time;
    private int level;
    private int gender;
    private String email;
    private LevelName levelName;
    private Sex sex;
    private Shop shop;

    public User() {
    }

    public User(Integer id, String username, String password, String phone, String address, Integer shopID, String time, int level, int gender, String email, LevelName levelName, Sex sex, Shop shop) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.shopID = shopID;
        this.time = time;
        this.level = level;
        this.gender = gender;
        this.email = email;
        this.levelName = levelName;
        this.sex = sex;
        this.shop = shop;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getShopID() {
        return shopID;
    }

    public void setShopID(Integer shopID) {
        this.shopID = shopID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LevelName getLevelName() {
        return levelName;
    }

    public void setLevelName(LevelName levelName) {
        this.levelName = levelName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", shopID=" + shopID +
                ", time='" + time + '\'' +
                ", level=" + level +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", levelName=" + levelName +
                ", sex=" + sex +
                ", shop=" + shop +
                '}';
    }
}