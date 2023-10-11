package unam.diplomado.safh.pacienteservice.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import unam.diplomado.safh.pacienteservice.domain.Paciente;
import unam.diplomado.safh.pacienteservice.dto.RegistroPacienteRequest;

@RequestMapping(path="api/pacientes", produces="application/json")
@CrossOrigin(origins="*")
@Tag(name="paciente", description="API del Recurso Paciente")
public interface PacienteApi {
	@Operation(summary = "Registrar Paciente")
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "201", 
		description = "Paciente Creado Exitosamente", 
	    content = { 
	    	@Content(mediaType="application/json", 
	    	schema = @Schema(implementation=Paciente.class)) }),
	  @ApiResponse(responseCode = "409", 
	  	description="Ya existe un paciente con el mail especificado", 
	    content = @Content) })
	@PostMapping(path="registro", consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	Paciente registrarPaciente(
		@NotNull @Valid @RequestBody RegistroPacienteRequest request);
	
	
	
		
		
	
	@Operation(summary = "Obtener Paciente")
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "200", 
		description = "Paciente Encontrado Exitosamente", 
	    content = { 
	    	@Content(mediaType="application/json", 
	    	schema = @Schema(implementation=Paciente.class)) }),
	  @ApiResponse(responseCode = "404", 
	  	description="Paciente no encontrado", 
	    content = @Content) })
	@GetMapping("{id}")
	public ResponseEntity<Paciente> obtenerPacientePorId(@PathVariable ("id") String id);
	
	
	@Operation(summary = "Obtener Todos los Pacientes")
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "202", 
		description = "Listado de pacientes", 
	    content = { 
	    	@Content(mediaType="application/json", 
	    	array = @ArraySchema (schema = @Schema(implementation=Paciente.class))) })
	})
	@GetMapping
	public List<Paciente> obtenerPacientes();
	
	
	@Operation(summary = "Eliminar  Paciente")
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "204", 
		description = "VOID", 
	    content = { 
	    	@Content(mediaType="application/json", 
	    	schema = @Schema(implementation=Paciente.class)) })
	})
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminarPaciente(@PathVariable("id") String id); 
	
	
}
