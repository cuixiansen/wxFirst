package com.example.demo.entity;

public class Userandvedio {
    private Integer userVedioId;

    private Integer vedioId;

    private Integer userId;

    private Integer ifPay;

    public Integer getUserVedioId() {
        return userVedioId;
    }

    public void setUserVedioId(Integer userVedioId) {
        this.userVedioId = userVedioId;
    }

    public Integer getVedioId() {
        return vedioId;
    }

    public void setVedioId(Integer vedioId) {
        this.vedioId = vedioId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIfPay() {
        return ifPay;
    }

    public void setIfPay(Integer ifPay) {
        this.ifPay = ifPay;
    }
}