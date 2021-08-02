package com.everis.d4i.tutorial.service.impl;

import com.everis.d4i.tutorial.persistence.CategoryRepository;
import com.everis.d4i.tutorial.persistence.mapper.CategoryEntityMapper;
import com.everis.d4i.tutorial.service.CategoryService;
import com.everis.d4i.tutorial.service.dto.CategoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Log4j2
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

	private final CategoryRepository categoryRepository;

	private final CategoryEntityMapper categoryEntityMapper;

	@Override
	public Collection<CategoryDto> getCategories() {
		return categoryRepository.findAll().parallelStream().map(categoryEntityMapper::mapToDto)
				.collect(Collectors.toList());
	}

	@Override
	public CategoryDto createCategory(final CategoryDto categoryDto) {
		return categoryEntityMapper.mapToDto(categoryRepository.save(categoryEntityMapper.mapToEntity(categoryDto)));
	}

}
