package com.everis.d4i.tutorial.service.impl;

import com.everis.d4i.tutorial.persistence.FilmRepository;
import com.everis.d4i.tutorial.persistence.mapper.FilmEntityMapper;
import com.everis.d4i.tutorial.service.FilmService;
import com.everis.d4i.tutorial.service.dto.FilmDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {

	private final FilmRepository filmRepository;

	private final FilmEntityMapper filmEntityMapper;

	@Override
	public Collection<FilmDto> getFilms() {
		return filmRepository.findAll().parallelStream().map(filmEntityMapper::mapToDto).collect(Collectors.toList());
	}
}
