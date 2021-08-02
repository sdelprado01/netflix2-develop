package com.everis.d4i.tutorial.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilmDto implements Serializable {

	private static final long serialVersionUID = 3045052568331442918L;

	private Long id;

	private String name;

	private Integer year;

	private String country;

	private String language;

	private Integer duration;

	private String shortDescription;

	private String longDescription;

}
