package com.example.demo.entity;

public class Test {
    private Integer testId;

    private String testTitle;

    private String testImgSrc;

    private Integer testPrice;

    private Integer testNum;

    private String testDesc;

    private String testText;

    private Integer ifThreeLevel;

    private Integer ifAdvice;

    private Integer ifSkip;

    private Integer testProblemNum;

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getTestTitle() {
        return testTitle;
    }

    public void setTestTitle(String testTitle) {
        this.testTitle = testTitle == null ? null : testTitle.trim();
    }

    public String getTestImgSrc() {
        return testImgSrc;
    }

    public void setTestImgSrc(String testImgSrc) {
        this.testImgSrc = testImgSrc == null ? null : testImgSrc.trim();
    }

    public Integer getTestPrice() {
        return testPrice;
    }

    public void setTestPrice(Integer testPrice) {
        this.testPrice = testPrice;
    }

    public Integer getTestNum() {
        return testNum;
    }

    public void setTestNum(Integer testNum) {
        this.testNum = testNum;
    }

    public String getTestDesc() {
        return testDesc;
    }

    public void setTestDesc(String testDesc) {
        this.testDesc = testDesc == null ? null : testDesc.trim();
    }

    public String getTestText() {
        return testText;
    }

    public void setTestText(String testText) {
        this.testText = testText == null ? null : testText.trim();
    }

    public Integer getIfThreeLevel() {
        return ifThreeLevel;
    }

    public void setIfThreeLevel(Integer ifThreeLevel) {
        this.ifThreeLevel = ifThreeLevel;
    }

    public Integer getIfAdvice() {
        return ifAdvice;
    }

    public void setIfAdvice(Integer ifAdvice) {
        this.ifAdvice = ifAdvice;
    }

    public Integer getIfSkip() {
        return ifSkip;
    }

    public void setIfSkip(Integer ifSkip) {
        this.ifSkip = ifSkip;
    }

    public Integer getTestProblemNum() {
        return testProblemNum;
    }

    public void setTestProblemNum(Integer testProblemNum) {
        this.testProblemNum = testProblemNum;
    }
}