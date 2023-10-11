package unam.diplomado.safh.pacienteservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info = @Info(
			version = "v1",
			title = "Safh Paciente Microservice Endpoints", 
			description = "Definición de los Endpoints de "
					+ "Paciente Service para el sistema Safh", 
			contact = @Contact(
				name = "UNAM", 
				url = "https://www.unam.mx/", 
			email = "univaroman28@hotmail.com")))
public class OpenApiConfig {

}
