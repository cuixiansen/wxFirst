package com.example.demo.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Audio {
    private Integer audioId;

    private String audioTitle;

    private Double audioPrice;

    private String audioImgSrc;

    private String audioAuthor;

    private String audioSrc;

    private Integer audioNominate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date audioDate;

    private String audioText;

    private String audioDesc;

    private Integer audioNum;

    public Integer getAudioId() {
        return audioId;
    }

    public void setAudioId(Integer audioId) {
        this.audioId = audioId;
    }

    public String getAudioTitle() {
        return audioTitle;
    }

    public void setAudioTitle(String audioTitle) {
        this.audioTitle = audioTitle == null ? null : audioTitle.trim();
    }

    public Double getAudioPrice() {
        return audioPrice;
    }

    public void setAudioPrice(Double audioPrice) {
        this.audioPrice = audioPrice;
    }

    public String getAudioImgSrc() {
        return audioImgSrc;
    }

    public void setAudioImgSrc(String audioImgSrc) {
        this.audioImgSrc = audioImgSrc == null ? null : audioImgSrc.trim();
    }

    public String getAudioAuthor() {
        return audioAuthor;
    }

    public void setAudioAuthor(String audioAuthor) {
        this.audioAuthor = audioAuthor == null ? null : audioAuthor.trim();
    }

    public String getAudioSrc() {
        return audioSrc;
    }

    public void setAudioSrc(String audioSrc) {
        this.audioSrc = audioSrc == null ? null : audioSrc.trim();
    }

    public Integer getAudioNominate() {
        return audioNominate;
    }

    public void setAudioNominate(Integer audioNominate) {
        this.audioNominate = audioNominate;
    }

    public Date getAudioDate() {
        return audioDate;
    }

    public void setAudioDate(Date audioDate) {
        this.audioDate = audioDate;
    }

    public String getAudioText() {
        return audioText;
    }

    public void setAudioText(String audioText) {
        this.audioText = audioText == null ? null : audioText.trim();
    }

    public String getAudioDesc() {
        return audioDesc;
    }

    public void setAudioDesc(String audioDesc) {
        this.audioDesc = audioDesc == null ? null : audioDesc.trim();
    }

    public Integer getAudioNum() {
        return audioNum;
    }

    public void setAudioNum(Integer audioNum) {
        this.audioNum = audioNum;
    }
}