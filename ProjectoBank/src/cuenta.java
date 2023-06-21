class cuenta {
	private double saldo = 0;
	private int agencia = 0;
	private int numero = 0;
	// Se hace referencia a que necesita un objeto de tipo cliente
	private cliente titular = new cliente();
	private static int total = 0;
	public cuenta (int agencia) {
		if (agencia <=0 ) {
			System.out.println("No se permite agencia menor a 0");
			this.agencia = 1; 
		}
		else {
			this.agencia=agencia;
		}
		total ++ ;
		System.out.println("Se creo la cuenta numero "+total);
	}
	
	
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
}
