class cuenta {
	double saldo = 0;
	int agencia = 0;
	int numero = 0;
	String titular = "def";

	// No retorna ningun valor
	public void deposito(double monto) {
		this.saldo += monto;
	}

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
			this.saldo -= monto;
			cuentaATransferir.deposito(monto);
			return true;
		}
		return false;
	}
}
