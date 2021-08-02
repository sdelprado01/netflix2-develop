package com.everis.d4i.tutorial.controller.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryRest implements Serializable {

	private static final long serialVersionUID = 180802329613616000L;

	@JsonProperty("id")
	private Long id;

	@JsonProperty("name")
	private String name;

}
