
public class crearCuenta {
public static void main(String[] args) {
	cuenta primerCuenta = new cuenta(32323) ;
	primerCuenta.deposito(1000);
	System.out.println(primerCuenta.getSaldo());
	
	
	cuenta segundaCuenta = new cuenta(232323);
	segundaCuenta.deposito(500);
	System.out.println(segundaCuenta.getSaldo());
}
}
