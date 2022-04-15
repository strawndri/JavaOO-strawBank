package strawBank;

public class criaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200.0;
		
		System.out.println("Saldo: R$" + primeiraConta.saldo);
	}
}
