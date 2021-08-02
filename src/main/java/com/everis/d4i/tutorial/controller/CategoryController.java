package com.everis.d4i.tutorial.controller;

import com.everis.d4i.tutorial.exception.NetflixException;
import com.everis.d4i.tutorial.controller.rest.CategoryRest;
import com.everis.d4i.tutorial.controller.rest.response.NetflixResponse;

public interface CategoryController {

	NetflixResponse<CategoryRest[]> getCategories() throws NetflixException;

	NetflixResponse<CategoryRest> createCategory(CategoryRest categoryRest) throws NetflixException;

}
