package strawBank;

public class testeMetodo {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.deposita(1200.50);
		System.out.println("Saldo da primeira conta: R$" + primeiraConta.saldo);
		
		String resultadoSaque = primeiraConta.saca(50.0);
		System.out.println(resultadoSaque);
		System.out.println("Saldo da primeira conta: R$" + primeiraConta.saldo);
		
		boolean resultadoTransferencia = primeiraConta.transfere(2000.9, segundaConta);
		
		if (resultadoTransferencia)  {
			System.out.println("A transferencia ocorreu com sucesso!");
			System.out.println("---------------------------------------------");
			System.out.println("Saldo da primeira conta: R$" + primeiraConta.saldo);
			System.out.println("Saldo da segunda conta: R$" + segundaConta.saldo);
		} else {
			System.out.println("Falha na transferencia.");
		}
	}
}
