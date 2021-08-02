package com.everis.d4i.tutorial.exception;

import com.everis.d4i.tutorial.exception.dto.ErrorDto;
import org.springframework.http.HttpStatus;

import java.util.Collections;

public class InternalServerErrorException extends NetflixException {

	private static final long serialVersionUID = -6870732210014274010L;

	public InternalServerErrorException(final String message) {
		super(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
	}

	public InternalServerErrorException(final String message, final ErrorDto data) {
		super(HttpStatus.INTERNAL_SERVER_ERROR.value(), message, Collections.singletonList(data));
	}

}
