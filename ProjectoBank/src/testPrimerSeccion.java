
public class testPrimerSeccion {
	public static void main(String[] args) {
		cuenta primerCuenta = new cuenta();
		primerCuenta.saldo = 100;
		System.out.println(primerCuenta.saldo);

		primerCuenta.saldo += 200;
		System.out.println(primerCuenta.saldo);

		cuenta segundaCuenta = primerCuenta;
		segundaCuenta.saldo = 50;

		System.out.println("primera cuenta tiene " + primerCuenta.saldo);
		System.out.println("segunda cuenta tiene " + segundaCuenta.saldo);

	}

}
