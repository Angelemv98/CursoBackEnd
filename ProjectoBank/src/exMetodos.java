public class exMetodos {
	public static void main(String[] args) {
		cuenta cuentaPersonal = new cuenta(1234124);
		cuentaPersonal.deposito(300);
		System.out.println(cuentaPersonal.getSaldo());

		cuentaPersonal.deposito(200);
		System.out.println(cuentaPersonal.getSaldo());
		
		cuentaPersonal.deposito(800);
		System.out.println(cuentaPersonal.getSaldo());
		
		cuentaPersonal.retirar(1400);
		System.out.println(cuentaPersonal.getSaldo());
		
		cuenta cuentaSecundariaCuenta = new cuenta(234324);
		cuentaSecundariaCuenta.deposito(1000);
		System.out.println(cuentaSecundariaCuenta.getSaldo());
		
		if (cuentaSecundariaCuenta.transferir(500, cuentaPersonal)) {
			System.out.println("Transfer Exitosa");
		}
		System.out.println(cuentaSecundariaCuenta.getSaldo());
		System.out.println(cuentaPersonal.getSaldo());
	}
}
