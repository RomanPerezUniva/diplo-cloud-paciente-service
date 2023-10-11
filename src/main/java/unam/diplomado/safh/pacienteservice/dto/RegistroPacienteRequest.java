package unam.diplomado.safh.pacienteservice.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import unam.diplomado.safh.pacienteservice.domain.Domicilio;
import unam.diplomado.safh.pacienteservice.domain.Paciente;

@Data
@NoArgsConstructor
public class RegistroPacienteRequest {
	@NotNull
	@Valid
	private Paciente paciente;
	@NotNull
	@Valid
	private Domicilio domicilio;
}
