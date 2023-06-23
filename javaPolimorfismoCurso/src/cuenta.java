public abstract class cuenta {
	protected double saldo = 0;
	private int agencia = 0;
	private int numero = 0;
	// Se hace referencia a que necesita un objeto de tipo cliente
	private cliente titular = new cliente();
	private static int total = 0;

	public cuenta() {
		
	}
	
	
	public cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		total++;
	}

	// No retorna ningun valor
	public abstract void deposito(double monto);
	
	
	// Retorna un booleano
	public boolean retirar(double monto) {
		if (this.saldo >= monto) {
			this.saldo -= monto;
			return true;
		}
		return false;
	}

	public boolean transferir(double monto, cuenta cuentaATransferir) {
		if (this.saldo >= monto) {
			this.retirar(monto);
			cuentaATransferir.deposito(monto);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setTitular(cliente titular) {
		this.titular = titular;
	}

	public cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return cuenta.total;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
