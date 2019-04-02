package com.example.demo.entity;

import java.util.Date;

public class Audio {
    private Integer audioId;

    private String audioTitle;

    private Integer audioPrice;

    private Double audioImgSrc;

    private String audioAuthor;

    private String audioSrc;

    private Integer audioOminate;

    private Date audioDate;

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

    public Integer getAudioPrice() {
        return audioPrice;
    }

    public void setAudioPrice(Integer audioPrice) {
        this.audioPrice = audioPrice;
    }

    public Double getAudioImgSrc() {
        return audioImgSrc;
    }

    public void setAudioImgSrc(Double audioImgSrc) {
        this.audioImgSrc = audioImgSrc;
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

    public Integer getAudioOminate() {
        return audioOminate;
    }

    public void setAudioOminate(Integer audioOminate) {
        this.audioOminate = audioOminate;
    }

    public Date getAudioDate() {
        return audioDate;
    }

    public void setAudioDate(Date audioDate) {
        this.audioDate = audioDate;
    }
}