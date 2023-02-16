package com.drakend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//define this class is a entity
@Entity
//define this class is table
@Table(name = "blog")
public class BlogEntity extends BaseEntity {
	// define this attribute is a column in this table
	@Column(name = "title")
	private String title;
	@Column(name = "thumbnail")
	private String thumbnail;
	@Column(name = "shortDescription", columnDefinition = "TEXT")
	private String shortDescription;
	@Column(name = "content", columnDefinition = "TEXT")
	private String content;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
