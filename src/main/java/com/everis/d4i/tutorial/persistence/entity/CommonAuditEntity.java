package com.everis.d4i.tutorial.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
@Getter
@Setter
class CommonAuditEntity implements Serializable {

	private static final long serialVersionUID = -7756255986410755231L;

	@CreationTimestamp
	@Column(name = "create_date", nullable = false, length = 9, updatable = false)
	private Timestamp createDate;

	@UpdateTimestamp
	@Column(name = "update_date", length = 9)
	private Timestamp updateDate;

}