package unam.diplomado.safh.pacienteservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import unam.diplomado.safh.pacienteservice.domain.Paciente;
import unam.diplomado.safh.pacienteservice.dto.RegistroPacienteRequest;
import unam.diplomado.safh.pacienteservice.service.PacienteService;

@RestController
public class PacienteController implements PacienteApi {

	@Autowired
	private PacienteService pacienteService;
	
	@Override
	public Paciente registrarPaciente(@NotNull @Valid RegistroPacienteRequest request) {
		return pacienteService.registrarPaciente(
				request.getPaciente(), request.getDomicilio());
	}

	
	

	@Override
	public ResponseEntity<Paciente> obtenerPacientePorId(String id) {
		return pacienteService.obtenerPaciente(id);
	}

	@Override
	public List<Paciente> obtenerPacientes() {
		return pacienteService.obtenerPacientes();
	}

	@Override
	public void eliminarPaciente(String id) {
		pacienteService.eliminarPaciente(id);
		
	}




	
	

}
