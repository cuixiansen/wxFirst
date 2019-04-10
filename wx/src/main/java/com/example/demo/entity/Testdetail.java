package com.example.demo.entity;

public class Testdetail {
    private Integer testDId;

    private Integer testId;

    private Integer testProblemId;

    private String testProblemText;

    private Integer testProblemPid;

    private String testProblemPPrefix;

    private String testProblemPtext;

    private String testOptionPrefix;

    private String testOptionText;

    private Double testOptionValue;

    private String testSkipValue;

    public Integer getTestDId() {
        return testDId;
    }

    public void setTestDId(Integer testDId) {
        this.testDId = testDId;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getTestProblemId() {
        return testProblemId;
    }

    public void setTestProblemId(Integer testProblemId) {
        this.testProblemId = testProblemId;
    }

    public String getTestProblemText() {
        return testProblemText;
    }

    public void setTestProblemText(String testProblemText) {
        this.testProblemText = testProblemText == null ? null : testProblemText.trim();
    }

    public Integer getTestProblemPid() {
        return testProblemPid;
    }

    public void setTestProblemPid(Integer testProblemPid) {
        this.testProblemPid = testProblemPid;
    }

    public String getTestProblemPPrefix() {
        return testProblemPPrefix;
    }

    public void setTestProblemPPrefix(String testProblemPPrefix) {
        this.testProblemPPrefix = testProblemPPrefix == null ? null : testProblemPPrefix.trim();
    }

    public String getTestProblemPtext() {
        return testProblemPtext;
    }

    public void setTestProblemPtext(String testProblemPtext) {
        this.testProblemPtext = testProblemPtext == null ? null : testProblemPtext.trim();
    }

    public String getTestOptionPrefix() {
        return testOptionPrefix;
    }

    public void setTestOptionPrefix(String testOptionPrefix) {
        this.testOptionPrefix = testOptionPrefix == null ? null : testOptionPrefix.trim();
    }

    public String getTestOptionText() {
        return testOptionText;
    }

    public void setTestOptionText(String testOptionText) {
        this.testOptionText = testOptionText == null ? null : testOptionText.trim();
    }

    public Double getTestOptionValue() {
        return testOptionValue;
    }

    public void setTestOptionValue(Double testOptionValue) {
        this.testOptionValue = testOptionValue;
    }

    public String getTestSkipValue() {
        return testSkipValue;
    }

    public void setTestSkipValue(String testSkipValue) {
        this.testSkipValue = testSkipValue == null ? null : testSkipValue.trim();
    }
}