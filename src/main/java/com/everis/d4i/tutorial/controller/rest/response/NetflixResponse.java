package com.everis.d4i.tutorial.controller.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class NetflixResponse<T> implements Serializable {

	private static final long serialVersionUID = 7302319210373510173L;

	private String status;

	private String code;

	private String message;

	private T data;

	public NetflixResponse(String status, String code, String message) {
		this.status = status;
		this.code = code;
		this.message = message;
	}

}
