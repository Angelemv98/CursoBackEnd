
public class exReferencia {
	public static void main(String[] args) {
		cliente angelCliente = new cliente();
		angelCliente.setNombre("Angel");
		angelCliente.setDocumento( "Ine"); 
		angelCliente.setTelefono("5523225264");

		cuenta cuentaAngel = new cuenta(213123213);
		// Se instancia en el titula el objeto cliente previamente creado
		cuentaAngel.setTitular(angelCliente);
		// Asi se puede acceder a los parametros de cliente mediante el objeto
		// referenciado
		System.out.println(cuentaAngel.getTitular().getNombre());

	}
}
