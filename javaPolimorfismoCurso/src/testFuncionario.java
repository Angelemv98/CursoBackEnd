
public class testFuncionario {
	public static void main(String[] args) {
		Funcionario angelFuncionario = new gerente();
		angelFuncionario.setNombre("Angel");
		angelFuncionario.setDocumento("Ine");
		angelFuncionario.setSalario(2000);
		
		System.out.println(angelFuncionario.getSalario());
		System.out.println(angelFuncionario.getBono());
		
		
		
		/////////////////////////////////////////////////////////////////////
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////// \n  GERENTE ");
		gerente ernesto = new gerente();
		ernesto.setDocumento("653224321");
		ernesto.setNombre("ernesto");
		ernesto.setSalario(6000);
		ernesto.setClave("AluraCursos");
		System.out.println(ernesto.iniciarSesion("AluraCursos"));
		System.out.println(ernesto.getBono());

	}
}
