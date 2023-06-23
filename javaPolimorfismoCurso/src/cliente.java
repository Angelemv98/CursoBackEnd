//TODO SIMPLEMENTE REVISAR EL POR QUE EL AUTENTICABLE SE QUEDA COMO ABSTRACTO O COMO INTERFAZ
public class cliente extends Autenticable{
	private String nombre = "";
	private String  documento = "";
	private String telefono = "";
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public double getBono() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
