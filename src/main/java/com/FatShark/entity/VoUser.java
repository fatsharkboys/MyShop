package com.FatShark.entity;

public class VoUser {
    private String username;
    private String password;
    private String phone;
    private String address;
    private Integer shopID;
    private int gender;
    private String email;
    private int level;
    private String time;

    public VoUser() {
    }

    public VoUser(String username, String password, String phone, String address, Integer shopID, int gender, String email, int level, String time) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.shopID = shopID;
        this.gender = gender;
        this.email = email;
        this.level = level;
        this.time = time;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "VoUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", shopID=" + shopID +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", level=" + level +
                ", time='" + time + '\'' +
                '}';
    }
}
