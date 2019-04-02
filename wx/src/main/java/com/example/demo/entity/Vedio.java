package com.example.demo.entity;

import java.util.Date;

public class Vedio {
    private Integer vedioId;

    private String vedioTitle;

    private Double vedioPrice;

    private String vedioImgSrc;

    private String vedioAuthor;

    private String vedioSrc;

    private Integer vedioNominate;

    private Date vedioDate;

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

	public Vedio(String vedioTitle, Double vedioPrice, String vedioImgSrc, String vedioAuthor, String vedioSrc,
			Integer vedioNominate, Date vedioDate) {
		super();
		this.vedioTitle = vedioTitle;
		this.vedioPrice = vedioPrice;
		this.vedioImgSrc = vedioImgSrc;
		this.vedioAuthor = vedioAuthor;
		this.vedioSrc = vedioSrc;
		this.vedioNominate = vedioNominate;
		this.vedioDate = vedioDate;
	}
    
}