package com.everis.d4i.tutorial.controller.mapper;

import com.everis.d4i.tutorial.exception.NetflixException;

import java.io.Serializable;

public interface RestMapper<R extends Serializable, D extends Serializable> {

	default R mapToRest(final D dto) throws NetflixException {
		throw new UnsupportedOperationException();
	}

	default D mapToDto(final R rest) throws NetflixException {
		throw new UnsupportedOperationException();
	}

}
