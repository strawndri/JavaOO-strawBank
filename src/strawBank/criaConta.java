package strawBank;

public class criaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 1000.0;
		
		Conta terceiraConta = primeiraConta;
		
		System.out.println("Primeira conta: " + primeiraConta.saldo);
		System.out.println("Segunda conta: " + segundaConta.saldo);
		System.out.println("Terceira conta: " + terceiraConta.saldo);
		
	}
}
