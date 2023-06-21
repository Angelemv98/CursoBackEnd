
public class exEncapsulamiento {
public static void main(String[] args) {
	cuenta cuenta = new cuenta(34234234);
	cliente cliente = new cliente();
	
	cliente.setNombre("Angel");
	cliente.setDocumento("asdasdf123");
	
	cuenta.setTitular(cliente);
	
	System.out.println(cliente.getNombre());
	System.out.println(cuenta.getTitular().getNombre());
	
}
}
