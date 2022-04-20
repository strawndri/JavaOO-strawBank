package strawBank;

public class testeReferencia {
	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		minhaConta.titular = new Cliente(); // criando cliente p/ minha conta
		
		// Aqui, estou realizando uma "conexão de classes": a partir da classe Cliente,
		// Eu consigo associá-la à classe Conta, já que esta contém um titular.
		
		minhaConta.titular.nome = "Andrieli";
		System.out.println(minhaConta.titular.nome);
	}
}
