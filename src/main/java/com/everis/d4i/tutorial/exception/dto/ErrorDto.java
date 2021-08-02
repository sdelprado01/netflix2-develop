package com.everis.d4i.tutorial.exception.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class ErrorDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	@NotNull
	private String value;

}
