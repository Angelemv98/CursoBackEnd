
public class crearCuenta {
public static void main(String[] args) {
	cuenta primerCuenta = new cuenta() ;
	primerCuenta.saldo = 1000;
	System.out.println(primerCuenta.saldo);
	
	
	cuenta segundaCuenta = new cuenta();
	segundaCuenta.saldo = 500;
	System.out.println(segundaCuenta.saldo);
}
}
