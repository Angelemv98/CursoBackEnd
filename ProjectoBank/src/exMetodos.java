public class exMetodos {
	public static void main(String[] args) {
		cuenta cuentaPersonal = new cuenta();
		cuentaPersonal.saldo = 300;
		System.out.println(cuentaPersonal.saldo);

		cuentaPersonal.deposito(200);
		System.out.println(cuentaPersonal.saldo);
		
		cuentaPersonal.deposito(800);
		System.out.println(cuentaPersonal.saldo);
		
		cuentaPersonal.retirar(1400);
		System.out.println(cuentaPersonal.saldo);
		
		cuenta cuentaSecundariaCuenta = new cuenta();
		cuentaSecundariaCuenta.deposito(1000);
		System.out.println(cuentaSecundariaCuenta.saldo);
		
		if (cuentaSecundariaCuenta.transferir(500, cuentaPersonal)) {
			System.out.println("Transfer Exitosa");
		}
		System.out.println(cuentaSecundariaCuenta.saldo);
		System.out.println(cuentaPersonal.saldo);
	}
}
