
public class Contador extends Funcionario{
	@Override
	public double getBono() {
		System.out.println("Ejecutando desde contador");
		return 200;
	}
	
	
	
}
