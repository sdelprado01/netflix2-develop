package com.everis.d4i.tutorial.exception;

import com.everis.d4i.tutorial.exception.dto.ErrorDto;
import org.springframework.http.HttpStatus;

import java.util.Collections;

public class NotFoundException extends NetflixException {

	private static final long serialVersionUID = -6870732210014274010L;

	public NotFoundException(final String message) {
		super(HttpStatus.NOT_FOUND.value(), message);
	}

	public NotFoundException(final String message, final ErrorDto data) {
		super(HttpStatus.NOT_FOUND.value(), message, Collections.singletonList(data));
	}
}
