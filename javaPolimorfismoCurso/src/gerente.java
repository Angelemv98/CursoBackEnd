
public class gerente extends Autenticable {

	//Se conoce como sobre escritura ya que se esta usando el mismo metodo por que esta reescribiendo la logica desde la hija
	@Override
	public double getBono() {
		System.out.println("Se ejecuta desde gerente");
		return super.getSalario() + this.getSalario() * 0.05;
	}
	
}
