package com.secured_template.infra.security;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Pedro Leon",
                        email = "pedrolbbcarvalho@gmail.com"
                ),
                title = "Trilha Back-End Codigo Certo 11/2024 ",
                description = " Sistema de lista de tarefas com autenticação",
                version = "1.0",
                license = @License(name = "Licence (Linkedin)",
                        url = "https://www.linkedin.com/in/pedro-leon-carvalho/"),
                termsOfService = "Terms of service"
        )
)
@SecurityScheme(
        name = "Authorization",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer",
        in = SecuritySchemeIn.HEADER)

public class SwaggerConfiguration {
}
