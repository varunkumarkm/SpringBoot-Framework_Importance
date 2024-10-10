package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/**
  When we create our packages outside our main package we have to specify like this using these annotations
  @ComponentScans({@ComponentScan("com.eazybytes.accounts.controller")})
  @EnableJpaRepositories("com.ezaybytes.accounts.repository")
  @EntityScan("com.eazybytes.accounts.model")
 */
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "EazyBank Accounts microservice REST API Documentation",
				version = "v1",
				//If we have any concern for this apis we can contact this details
				contact = @Contact(
						name = "Varunkumar K M",
						email = "varunkumarkm44@gmail.com",
						url = "http://www.m2tradewave.com/"
				),
				//Api is free to use or any other license is required
				license = @License(
						name = "Apache 2.0",
						url = "http://www.m2tradewave.com/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EazyBank Accounts microservice REST API Documentation",
				url = "http://www.m2tradewave.com/swagger-ui.html"
		)
		//if required we're going to add more details over here
)
public class AccountsApplication {

	public static void main(String[] args) {

		SpringApplication.run(AccountsApplication.class, args);
	}

}
