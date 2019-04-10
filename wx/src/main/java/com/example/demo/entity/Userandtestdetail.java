package com.example.demo.entity;

public class Userandtestdetail {
    private Integer userDetailId;

    private Integer testId;

    private Integer userId;

    private Integer testProblemId;

    private String userAnswer;

    public Integer getUserDetailId() {
        return userDetailId;
    }

    public void setUserDetailId(Integer userDetailId) {
        this.userDetailId = userDetailId;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTestProblemId() {
        return testProblemId;
    }

    public void setTestProblemId(Integer testProblemId) {
        this.testProblemId = testProblemId;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer == null ? null : userAnswer.trim();
    }
}