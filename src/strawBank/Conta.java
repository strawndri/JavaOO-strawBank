package strawBank;

class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular; // titular é do tipo Cliente

	public void deposita(double valor) {

		saldo += valor;

		// se quiser, também é possível escrever this.saldo para
		// indicar que o salto é para a objeto de certa referência
		// que está utilizando o método.
	}
	
	public boolean verificaSaldo(double valor) {
		if (saldo >= valor) {
			return true;
		}
		return false;
	}

	public String saca(double valor) {
		if (verificaSaldo(valor)) {
			saldo -= valor;
			return "Valor sacado: R$ " + valor + " | Saldo: R$" + saldo;
		}
		return "Não foi possível realidar o saque. Saldo atual é: R$" + saldo;
	}

	
	public boolean transfere(double valor, Conta destino) {
		if (verificaSaldo(valor)) {
			saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false; // não precisa criar um else, já que, se caso for true, o processedimento é
		  			 // parado.
	}
}
