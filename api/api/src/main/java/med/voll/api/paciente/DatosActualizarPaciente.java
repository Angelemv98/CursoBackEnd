package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.direccion.DatosDireccion;
import med.voll.api.direccion.DatosDireccionPaciente;

public record DatosActualizarPaciente(@NotNull Long id, String nombre, String documentoIdentidad, DatosDireccionPaciente direccion) {
}
