
public class testCuenta {
public static void main(String[] args) {
	cuentaCorriente cc = new cuentaCorriente(1, 1);
	cuentaAhorros ca = new cuentaAhorros(2, 2);
	
	cc.deposito(2000);
	
	
	cc.transferir(1000, ca);
	
	System.out.println(cc.getSaldo());
	System.out.println(ca.getSaldo());

	
}
}
