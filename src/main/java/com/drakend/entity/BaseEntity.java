package com.drakend.entity;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	// define this attribute is a primary key
	@Id
	// define this attribute is auto increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// define this attribute is a column in this table
	@Column(name = "createat")
	@CreatedDate
	private String creatAt;
	@LastModifiedDate
	@Column(name = "modifiedat")
	private String modifiedAt;
	@Column(name = "createby")
	@CreatedBy
	private String creatBy;
	@Column(name = "modifiedby")
	@LastModifiedBy
	private String modifiedBy;
	@Column(name = "isdelete")
	private Integer isDelete;

	public String getCreatAt() {
		return creatAt;
	}

	public String getModifiedAt() {
		return modifiedAt;
	}

	public String getCreatBy() {
		return creatBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public Long getId() {
		return id;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

}
