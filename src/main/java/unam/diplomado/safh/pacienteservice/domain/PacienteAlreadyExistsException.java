package unam.diplomado.safh.pacienteservice.domain;

public class PacienteAlreadyExistsException extends RuntimeException {
	public PacienteAlreadyExistsException(String telefono) {
		super("Ya existe un paciente registrado con telefono: " + telefono);
	}
}
