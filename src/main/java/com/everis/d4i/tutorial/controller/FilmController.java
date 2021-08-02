package com.everis.d4i.tutorial.controller;

import com.everis.d4i.tutorial.exception.NetflixException;
import com.everis.d4i.tutorial.controller.rest.FilmRest;
import com.everis.d4i.tutorial.controller.rest.response.NetflixResponse;

public interface FilmController {

	NetflixResponse<FilmRest[]> getFilms() throws NetflixException;
}
