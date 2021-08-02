package com.everis.d4i.tutorial.config;

import com.everis.d4i.tutorial.util.constant.RestConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * This is used to enable swagger configuration.<br/>
 * Swagger is used for REST API documentation<br/>
 * Use swagger-ui.html to access the api doc<br/>
 * Example : http://localhost:server.port/swagger-ui.html<br/>
 * 
 * http://localhost:8088/netflix/v1/swagger-ui.html
 * 
 * <br/>
 * <br/>
 *
 * How to generate document ? <br/>
 * Step 1: get JSON from api-docs by giving the group-name (example
 * http://localhost:server.port/v2/api-docs?group=CustomerServices ) <br/>
 * Step 2: goto http://editor.swagger.io/ : its an editor which is online and do
 * paste JSON and generate document<br/>
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Netflix 2").apiInfo(apiInfo()).select()
				.paths(regex(".*" + RestConstants.APPLICATION_NAME + "/.*")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Netflix 2").description("Film Api")
				.termsOfServiceUrl("https://www.everis.com").license("everis").licenseUrl("https://www.everis.com")
				.version("1.0").build();
	}
}
