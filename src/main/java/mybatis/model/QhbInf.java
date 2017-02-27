package main.java.mybatis.model;

import java.util.Date;

public class QhbInf {
    private Integer id;

    private Integer userId;

    private String userIp;

    private Date qhbTime;

    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    public Date getQhbTime() {
        return qhbTime;
    }

    public void setQhbTime(Date qhbTime) {
        this.qhbTime = qhbTime;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}