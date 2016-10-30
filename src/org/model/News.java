package org.model;

import java.sql.Timestamp;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	private Integer newsId;
	private String newsName;
	private String newsPic;
	private String newsContent;
	private Timestamp newsDate;
	private Short newsState;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** minimal constructor */
	public News(Integer newsId) {
		this.newsId = newsId;
	}

	/** full constructor */
	public News(Integer newsId, String newsName, String newsPic,
			String newsContent, Timestamp newsDate, Short newsState) {
		this.newsId = newsId;
		this.newsName = newsName;
		this.newsPic = newsPic;
		this.newsContent = newsContent;
		this.newsDate = newsDate;
		this.newsState = newsState;
	}

	// Property accessors

	public Integer getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public String getNewsName() {
		return this.newsName;
	}

	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}

	public String getNewsPic() {
		return this.newsPic;
	}

	public void setNewsPic(String newsPic) {
		this.newsPic = newsPic;
	}

	public String getNewsContent() {
		return this.newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	public Timestamp getNewsDate() {
		return this.newsDate;
	}

	public void setNewsDate(Timestamp newsDate) {
		this.newsDate = newsDate;
	}

	public Short getNewsState() {
		return this.newsState;
	}

	public void setNewsState(Short newsState) {
		this.newsState = newsState;
	}

}