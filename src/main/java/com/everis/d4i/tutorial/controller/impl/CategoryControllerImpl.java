package com.everis.d4i.tutorial.controller.impl;

import com.everis.d4i.tutorial.controller.CategoryController;
import com.everis.d4i.tutorial.controller.mapper.CategoryRestMapper;
import com.everis.d4i.tutorial.exception.NetflixException;
import com.everis.d4i.tutorial.controller.rest.CategoryRest;
import com.everis.d4i.tutorial.controller.rest.response.NetflixResponse;
import com.everis.d4i.tutorial.service.CategoryService;
import com.everis.d4i.tutorial.util.constant.CommonConstants;
import com.everis.d4i.tutorial.util.constant.RestConstants;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(RestConstants.APPLICATION_NAME + RestConstants.API_VERSION_1)
@RequiredArgsConstructor
public class CategoryControllerImpl implements CategoryController {

	private final CategoryService categoryService;

	private final CategoryRestMapper categoryRestMapper;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = RestConstants.RESOURCE_CATEGORY, produces = MediaType.APPLICATION_JSON_VALUE)
	public NetflixResponse<CategoryRest[]> getCategories() throws NetflixException {
		return new NetflixResponse<>(CommonConstants.SUCCESS, String.valueOf(HttpStatus.OK), CommonConstants.OK,
				categoryService.getCategories().parallelStream().map(categoryRestMapper::mapToRest).toArray(CategoryRest[]::new));
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = RestConstants.RESOURCE_CATEGORY, produces = MediaType.APPLICATION_JSON_VALUE)
	public NetflixResponse<CategoryRest> createCategory(
			@ApiParam(value = RestConstants.PARAMETER_CATEGORY, required = true) @RequestBody @Valid final CategoryRest categoryRest)
			throws NetflixException {
		return new NetflixResponse<>(CommonConstants.SUCCESS, String.valueOf(HttpStatus.CREATED), CommonConstants.OK,
				categoryRestMapper.mapToRest(categoryService.createCategory(categoryRestMapper.mapToDto(categoryRest))));
	}

}
