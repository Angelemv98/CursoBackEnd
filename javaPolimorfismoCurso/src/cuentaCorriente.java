
public class cuentaCorriente extends cuenta {
	public cuentaCorriente(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override
	public boolean retirar(double monto) {
		double comision = 0.2;
		return super.retirar(monto + comision);
	}

	@Override
	public void deposito(double monto) {
		this.saldo += monto;
	}
}
