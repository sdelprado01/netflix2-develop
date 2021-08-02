package com.everis.d4i.tutorial.controller.mapper;

import com.everis.d4i.tutorial.controller.rest.CategoryRest;
import com.everis.d4i.tutorial.service.dto.CategoryDto;
import org.springframework.stereotype.Component;

@Component
public class CategoryRestMapper implements RestMapper<CategoryRest, CategoryDto> {

	@Override
	public CategoryRest mapToRest(final CategoryDto categoryDto) {

		final Long id = categoryDto.getId();
		final String name = categoryDto.getName();

		return new CategoryRest(id, name);
	}

	@Override
	public CategoryDto mapToDto(final CategoryRest categoryRest) {

		final Long id = categoryRest.getId();
		final String name = categoryRest.getName();

		return new CategoryDto(id, name);
	}
}
