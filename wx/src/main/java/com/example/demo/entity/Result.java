package com.example.demo.entity;

public class Result {
    private Integer resultId;

    private Integer testId;

    private String resultPrefix;

    private Double minGrade;

    private Double maxGrade;

    private String resultText;

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getResultPrefix() {
        return resultPrefix;
    }

    public void setResultPrefix(String resultPrefix) {
        this.resultPrefix = resultPrefix == null ? null : resultPrefix.trim();
    }

    public Double getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(Double minGrade) {
        this.minGrade = minGrade;
    }

    public Double getMaxGrade() {
        return maxGrade;
    }

    public void setMaxGrade(Double maxGrade) {
        this.maxGrade = maxGrade;
    }

    public String getResultText() {
        return resultText;
    }

    public void setResultText(String resultText) {
        this.resultText = resultText == null ? null : resultText.trim();
    }
}