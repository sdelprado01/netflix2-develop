package com.everis.d4i.tutorial.persistence.mapper;

import com.everis.d4i.tutorial.persistence.entity.FilmEntity;
import com.everis.d4i.tutorial.service.dto.FilmDto;
import org.springframework.stereotype.Component;

@Component
public class FilmEntityMapper implements EntityMapper<FilmEntity, FilmDto> {

	@Override
	public FilmDto mapToDto(final FilmEntity filmEntity) {

		final Long id = filmEntity.getId();
		final String name = filmEntity.getName();
		final Integer year = Integer.parseInt(filmEntity.getYear().toString());
		final String country = filmEntity.getCountry();
		final String language = filmEntity.getLanguage();
		final Integer duration = filmEntity.getDuration();
		final String shortDescription = filmEntity.getShortDescription();
		final String longDescription = filmEntity.getLongDescription();

		return new FilmDto(id, name, year, country, language, duration, shortDescription, longDescription);
	}

}
