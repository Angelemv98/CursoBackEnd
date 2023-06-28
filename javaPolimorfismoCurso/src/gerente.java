
public class gerente  extends Funcionario implements Autenticable {

	//Se conoce como sobre escritura ya que se esta usando el mismo metodo por que esta reescribiendo la logica desde la hija
	@Override
	public double getBono() {
		System.out.println("Se ejecuta desde gerente");
		return super.getSalario() + this.getSalario() * 0.05;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}
	
}
