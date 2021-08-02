package com.everis.d4i.tutorial.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDto implements Serializable {

	private static final long serialVersionUID = 3045052880331442018L;

	private Long id;

	private String name;

}
