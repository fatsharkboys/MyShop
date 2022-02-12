package com.FatShark.entity;

import java.io.Serializable;

/**
 * (Levelname)实体类
 *
 * @author makejava
 * @since 2021-12-09 08:04:26
 */
public class LevelName implements Serializable {
    private static final long serialVersionUID = -22690832802574591L;
    
    private Integer id;
    
    private Integer level;
    
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LevelName(Integer id, Integer level, String name) {
        this.id = id;
        this.level = level;
        this.name = name;
    }

    public LevelName() {
    }

    @Override
    public String toString() {
        return "LevelName{" +
                "id=" + id +
                ", level=" + level +
                ", name='" + name + '\'' +
                '}';
    }
}

