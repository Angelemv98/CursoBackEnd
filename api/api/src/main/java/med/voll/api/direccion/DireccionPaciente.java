package med.voll.api.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class DireccionPaciente {
    private String urbanizacion;
    private  String distrito;
    private  String codigopostal;
    private String complemento;
    private  String numero;
    private  String provincia;
    private  String ciudad;


    public DireccionPaciente(DatosDireccionPaciente direccion) {
        this.urbanizacion = direccion.urbanizacion();
        this.distrito = direccion.distrito();
        this.codigopostal = direccion.codigopostal();
        this.complemento = direccion.complemento();
        this.numero = direccion.numero();
        this.provincia = direccion.provincia();
        this.ciudad = direccion.ciudad();
    }

    public DireccionPaciente actualizarDatos(DatosDireccionPaciente direccion) {
        this.urbanizacion = direccion.urbanizacion();
        this.distrito = direccion.distrito();
        this.codigopostal = direccion.codigopostal();
        this.complemento = direccion.complemento();
        this.numero = direccion.numero();
        this.provincia = direccion.provincia();
        this.ciudad = direccion.ciudad();
        return this;
    }
}
