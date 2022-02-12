package com.FatShark.entity;

import java.io.Serializable;

/**
 * (Sex)实体类
 *
 * @author makejava
 * @since 2021-12-09 08:07:16
 */
public class Sex implements Serializable {
    private static final long serialVersionUID = -74587158149297651L;
    
    private Integer id;
    
    private Integer gender;
    
    private String sexName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }


    public Sex() {
    }

    public Sex(Integer id, Integer gender, String sexName) {
        this.id = id;
        this.gender = gender;
        this.sexName = sexName;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "id=" + id +
                ", gender=" + gender +
                ", sexName='" + sexName + '\'' +
                '}';
    }
}

