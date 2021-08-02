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
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "casts", uniqueConstraints = {@UniqueConstraint(name = "unique_person_role_film", columnNames = {"person_id", "role_id", "film_id"})})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CastEntity extends CommonAuditEntity {

	private static final long serialVersionUID = -5461593488647785155L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id", nullable = false)
	private PersonEntity personEntity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	private RoleEntity roleEntity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "film_id", nullable = false)
	private FilmEntity filmEntity;

}
