package com.everis.d4i.tutorial.service;

import com.everis.d4i.tutorial.exception.NetflixException;
import com.everis.d4i.tutorial.service.dto.CategoryDto;

import java.util.Collection;

public interface CategoryService {

	Collection<CategoryDto> getCategories() throws NetflixException;

	CategoryDto createCategory(CategoryDto categoryDto) throws NetflixException;
}
