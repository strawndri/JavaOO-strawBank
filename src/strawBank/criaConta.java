package strawBank;

public class criaConta {
	
	public static void main(String[] args) {
		
		// referência ao objeto 01
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		
		// referência ao objeto 02
		Conta segundaConta = new Conta();
		segundaConta.saldo = 1000.0;
		
		// referência ao objeto 01
		Conta terceiraConta = primeiraConta;
		
		System.out.println("Primeira conta: " + primeiraConta.saldo);
		System.out.println("Segunda conta: " + segundaConta.saldo);
		System.out.println("Terceira conta: " + terceiraConta.saldo);
		
		// Diferentes referências podem estar associadas ao mesmo objeto,
		// que é o caso da primeira e da terceira conta.
		
	}
}
