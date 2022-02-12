package com.FatShark.entity;

import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2021-11-03 07:53:49
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -78960919410853817L;

    private Integer id;

    private Integer orderID;

    private String orderTime;

    private Integer pay;
    private Integer send;
    private Integer orderPr;

    private User user;
    private Project project;

    public Order(Integer id, Integer orderID, String orderTime, Integer pay, Integer send, Integer orderPr, User user, Project project) {
        this.id = id;
        this.orderID = orderID;
        this.orderTime = orderTime;
        this.pay = pay;
        this.send = send;
        this.orderPr = orderPr;
        this.user = user;
        this.project = project;
    }

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public Integer getSend() {
        return send;
    }

    public void setSend(Integer send) {
        this.send = send;
    }

    public Integer getOrderPr() {
        return orderPr;
    }

    public void setOrderPr(Integer orderPr) {
        this.orderPr = orderPr;
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
        return "Order{" +
                "id=" + id +
                ", orderID=" + orderID +
                ", orderTime='" + orderTime + '\'' +
                ", pay=" + pay +
                ", send=" + send +
                ", orderPr=" + orderPr +
                ", user=" + user +
                ", project=" + project +
                '}';
    }
}