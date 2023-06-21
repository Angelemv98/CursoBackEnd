
public class testPrimerSeccion {
	public static void main(String[] args) {
		cuenta primerCuenta = new cuenta(23123123);
		primerCuenta.deposito(100);
		System.out.println(primerCuenta.getSaldo());

		primerCuenta.deposito(200);;
		System.out.println(primerCuenta.getSaldo());

		cuenta segundaCuenta = primerCuenta;
		segundaCuenta.deposito(50);;

		System.out.println("primera cuenta tiene " + primerCuenta.getSaldo());
		System.out.println("segunda cuenta tiene " + segundaCuenta.getSaldo());

	}

}
