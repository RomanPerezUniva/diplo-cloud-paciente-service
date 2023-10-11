package unam.diplomado.safh.pacienteservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import unam.diplomado.safh.pacienteservice.domain.Domicilio;
import unam.diplomado.safh.pacienteservice.domain.Paciente;

public interface PacienteService {
	Paciente registrarPaciente(
			Paciente paciente, Domicilio domicilio);
	ResponseEntity<Paciente> obtenerPaciente(String id);
	List<Paciente> obtenerPacientes();
	void eliminarPaciente(String id);
	
}
