package com.everis.d4i.tutorial.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.Year;
import java.util.Collection;

@Entity
@Table(name = "films")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FilmEntity extends CommonAuditEntity {

	private static final long serialVersionUID = 5265882376461617162L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "year", nullable = false)
	private Year year;

	@Column(name = "country", nullable = false)
	private String country;

	@Column(name = "language", nullable = false)
	private String language;

	@Column(name = "duration")
	private Integer duration;

	@Column(name = "short_desc")
	private String shortDescription;

	@Column(name = "long_desc")
	private String longDescription;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private CategoryEntity categoryEntity;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "filmEntity")
	private Collection<CastEntity> castEntityCollection;

}
