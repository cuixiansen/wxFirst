package com.example.demo.entity;

public class Userandtest {
    private Integer userTestId;

    private Integer userId;

    private Integer testId;

    private Integer ifPay;

    private Integer ifComplete;

    private String resultPrefic;

    private String resultText;

    private Double resultGrade;

    public Integer getUserTestId() {
        return userTestId;
    }

    public void setUserTestId(Integer userTestId) {
        this.userTestId = userTestId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getIfPay() {
        return ifPay;
    }

    public void setIfPay(Integer ifPay) {
        this.ifPay = ifPay;
    }

    public Integer getIfComplete() {
        return ifComplete;
    }

    public void setIfComplete(Integer ifComplete) {
        this.ifComplete = ifComplete;
    }

    public String getResultPrefic() {
        return resultPrefic;
    }

    public void setResultPrefic(String resultPrefic) {
        this.resultPrefic = resultPrefic == null ? null : resultPrefic.trim();
    }

    public String getResultText() {
        return resultText;
    }

    public void setResultText(String resultText) {
        this.resultText = resultText == null ? null : resultText.trim();
    }

    public Double getResultGrade() {
        return resultGrade;
    }

    public void setResultGrade(Double resultGrade) {
        this.resultGrade = resultGrade;
    }
}