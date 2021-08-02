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
public class FilmRest implements Serializable {

    private static final long serialVersionUID = 3045052550331442918L;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("country")
    private String country;

    @JsonProperty("language")
    private String language;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("shortDescription")
    private String shortDescription;

    @JsonProperty("longDescription")
    private String longDescription;

}
