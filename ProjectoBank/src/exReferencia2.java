
public class exReferencia2 {
public static void main(String[] args) {
	cuenta angelCuenta = new cuenta(3213123);
	cliente cliente = new cliente();
	angelCuenta.setTitular(cliente);
	System.out.println(angelCuenta.getTitular().getNombre());
		
}
}
