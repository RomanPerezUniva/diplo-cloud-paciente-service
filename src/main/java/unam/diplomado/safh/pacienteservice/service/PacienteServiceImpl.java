package unam.diplomado.safh.pacienteservice.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import unam.diplomado.safh.pacienteservice.domain.Domicilio;
import unam.diplomado.safh.pacienteservice.domain.Paciente;
import unam.diplomado.safh.pacienteservice.domain.PacienteAlreadyExistsException;
import unam.diplomado.safh.pacienteservice.repository.PacienteRepository;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteRepository pacienteRepository;
	
	private static final Logger LOG = 
			LoggerFactory.getLogger(PacienteServiceImpl.class);
	
	
	@Override
	public Paciente registrarPaciente(Paciente paciente, Domicilio domicilio) {
		// validacion paciente existente
				Optional<Paciente> pacienteExistente = 
						pacienteRepository.findByTelefonoCelular(paciente.getTelefonoCelular());
				if (pacienteExistente.isPresent()) {
					throw new PacienteAlreadyExistsException(paciente.getTelefonoCelular());
				}
				
				// guardar paciente
				paciente.getDomicilios().add(domicilio);
				pacienteRepository.save(paciente);
				LOG.info("Paciente Registrado: " + paciente);
				
				return paciente;
	}


	

	
	@Override
	public ResponseEntity<Paciente> obtenerPaciente(String id) {
		 Optional<Paciente> paciente= pacienteRepository.findById(id);
		 if(paciente.isPresent()) {
			 return new ResponseEntity<>(paciente.get(), HttpStatus.OK);
			 
		 }
		 return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}


	@Override
	public List<Paciente> obtenerPacientes() {
		return pacienteRepository.findAll();
	}


	@Override
	public void eliminarPaciente(String id) {
		pacienteRepository.deleteById(id);
		
	}






}
