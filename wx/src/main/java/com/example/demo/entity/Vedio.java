package com.example.demo.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Vedio {
    private Integer vedioId;

    private String vedioTitle;

    private Double vedioPrice;

    private String vedioImgSrc;

    private String vedioAuthor;

    private String vedioSrc;

    private Integer vedioNominate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date vedioDate;

    private String vedioText;

    private String vedioDesc;

    private Integer vedioNum;

    public Integer getVedioId() {
        return vedioId;
    }

    public void setVedioId(Integer vedioId) {
        this.vedioId = vedioId;
    }

    public String getVedioTitle() {
        return vedioTitle;
    }

    public void setVedioTitle(String vedioTitle) {
        this.vedioTitle = vedioTitle == null ? null : vedioTitle.trim();
    }

    public Double getVedioPrice() {
        return vedioPrice;
    }

    public void setVedioPrice(Double vedioPrice) {
        this.vedioPrice = vedioPrice;
    }

    public String getVedioImgSrc() {
        return vedioImgSrc;
    }

    public void setVedioImgSrc(String vedioImgSrc) {
        this.vedioImgSrc = vedioImgSrc == null ? null : vedioImgSrc.trim();
    }

    public String getVedioAuthor() {
        return vedioAuthor;
    }

    public void setVedioAuthor(String vedioAuthor) {
        this.vedioAuthor = vedioAuthor == null ? null : vedioAuthor.trim();
    }

    public String getVedioSrc() {
        return vedioSrc;
    }

    public void setVedioSrc(String vedioSrc) {
        this.vedioSrc = vedioSrc == null ? null : vedioSrc.trim();
    }

    public Integer getVedioNominate() {
        return vedioNominate;
    }

    public void setVedioNominate(Integer vedioNominate) {
        this.vedioNominate = vedioNominate;
    }

    public Date getVedioDate() {
        return vedioDate;
    }

    public void setVedioDate(Date vedioDate) {
        this.vedioDate = vedioDate;
    }

    public String getVedioText() {
        return vedioText;
    }

    public void setVedioText(String vedioText) {
        this.vedioText = vedioText == null ? null : vedioText.trim();
    }

    public String getVedioDesc() {
        return vedioDesc;
    }

    public void setVedioDesc(String vedioDesc) {
        this.vedioDesc = vedioDesc == null ? null : vedioDesc.trim();
    }

    public Integer getVedioNum() {
        return vedioNum;
    }

    public void setVedioNum(Integer vedioNum) {
        this.vedioNum = vedioNum;
    }

	public Vedio() {
		super();
	}

	public Vedio(String vedioTitle, Double vedioPrice, String vedioAuthor, Integer vedioNominate, Date vedioDate,
			String vedioText, String vedioDesc, Integer vedioNum) {
		super();
		this.vedioTitle = vedioTitle;
		this.vedioPrice = vedioPrice;
		this.vedioAuthor = vedioAuthor;
		this.vedioNominate = vedioNominate;
		this.vedioDate = vedioDate;
		this.vedioText = vedioText;
		this.vedioDesc = vedioDesc;
		this.vedioNum = vedioNum;
	}

	@Override
	public String toString() {
		return "Vedio [vedioId=" + vedioId + ", vedioTitle=" + vedioTitle + ", vedioPrice=" + vedioPrice
				+ ", vedioImgSrc=" + vedioImgSrc + ", vedioAuthor=" + vedioAuthor + ", vedioSrc=" + vedioSrc
				+ ", vedioNominate=" + vedioNominate + ", vedioDate=" + vedioDate + ", vedioText=" + vedioText
				+ ", vedioDesc=" + vedioDesc + ", vedioNum=" + vedioNum + "]";
	}
    
}