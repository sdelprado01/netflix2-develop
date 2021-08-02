package com.everis.d4i.tutorial.controller.mapper;

import com.everis.d4i.tutorial.controller.rest.FilmRest;
import com.everis.d4i.tutorial.service.dto.FilmDto;
import org.springframework.stereotype.Component;

@Component
public class FilmRestMapper implements RestMapper<FilmRest, FilmDto>{

	@Override
	public FilmRest mapToRest(final FilmDto filmDto) {

		final Long id = filmDto.getId();
		final String name = filmDto.getName();
		final Integer year = filmDto.getYear();
		final String country = filmDto.getCountry();
		final String language = filmDto.getLanguage();
		final Integer duration = filmDto.getDuration();
		final String shortDescription = filmDto.getShortDescription();
		final String longDescription = filmDto.getLongDescription();

		return new FilmRest(id, name, year, country, language, duration, shortDescription, longDescription);
	}
}
