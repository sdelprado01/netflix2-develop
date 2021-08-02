package com.everis.d4i.tutorial.persistence.mapper;

import com.everis.d4i.tutorial.persistence.entity.CategoryEntity;
import com.everis.d4i.tutorial.persistence.entity.FilmEntity;
import com.everis.d4i.tutorial.service.dto.CategoryDto;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class CategoryEntityMapper implements EntityMapper<CategoryEntity, CategoryDto> {

	@Override
	public CategoryDto mapToDto(final CategoryEntity categoryEntity) {

		final Long id = categoryEntity.getId();
		final String name = categoryEntity.getName();

		return new CategoryDto(id, name);
	}

	@Override
	public CategoryEntity mapToEntity(final CategoryDto categoryDto) {

		final Long id = categoryDto.getId();
		final String name = categoryDto.getName();
		final Collection<FilmEntity> filmEntityCollection = Collections.emptyList();

		return new CategoryEntity(id, name, filmEntityCollection);
	}


}
