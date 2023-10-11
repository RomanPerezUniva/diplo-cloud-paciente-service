package unam.diplomado.safh.pacienteservice.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

import unam.diplomado.safh.pacienteservice.domain.Paciente;

public interface PacienteRepository 
extends MongoRepository<Paciente,String>{
	Optional<Paciente> findByTelefonoCelular(String celular);
	Optional<Paciente> findByNombre(String nombre);
}
