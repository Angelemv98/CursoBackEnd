package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.DatosActulizarMedico;
import med.voll.api.medico.DatosListadoMedico;
import med.voll.api.medico.Medico;
import med.voll.api.paciente.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void registrar(@RequestBody @Valid DatosRegistroPaciente datos) {
        repository.save(new Paciente(datos));
    }

    @GetMapping
    public Page<DatosListadoPaciente> listadoPacientes(@PageableDefault(size = 10) @SortDefault(sort = "nombre") Pageable paginacion){
        return repository.findByActivoTrue(paginacion).map(DatosListadoPaciente::new);
    }

    @PutMapping
    @Transactional
    public void actualizarPaciente(@RequestBody @Valid DatosActualizarPaciente datosActualizarPaciente) {
        Paciente paciente = repository.getReferenceById(datosActualizarPaciente.id());
        paciente.actualizarDatos(datosActualizarPaciente);
    }
    //Delete logico
    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarPaciente(@PathVariable Long id){
        Paciente paciente = repository.getReferenceById(id);
        paciente.desactivarMedico();
    }
}