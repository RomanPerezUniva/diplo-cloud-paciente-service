package unam.diplomado.safh.pacienteservice.domain;

import java.util.Collection;
import java.util.LinkedHashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="pacientes")
public class Paciente {
	@Id
	private String id;
	@NotBlank(message="Nombre no puede ser blanco")
	private String nombre;
	@NotBlank(message="Telefono celular no puede ser blanco")
	private String telefonoCelular;
	private String ultimoIngreso;
	private Collection<Domicilio> domicilios = new LinkedHashSet<>();
}
