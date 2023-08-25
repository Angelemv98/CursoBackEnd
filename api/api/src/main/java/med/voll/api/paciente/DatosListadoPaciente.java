package med.voll.api.paciente;

import med.voll.api.medico.Medico;

public record DatosListadoPaciente (Long id, String nombre, String telefono , String documentoIdentidad, String email){

    public  DatosListadoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNombre(), paciente.getTelefono(), paciente.getDocumentoIdentidad(), paciente.getEmail());
    }

}
