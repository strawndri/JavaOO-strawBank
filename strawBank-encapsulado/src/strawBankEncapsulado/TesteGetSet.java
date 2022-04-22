package strawBankEncapsulado;

public class TesteGetSet {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		Cliente cliente = new Cliente();
						
		conta.setNumero(123456);
		
		System.out.println(conta.getNumero());
		
		cliente.setNome("Andrieli");
		
		System.out.println(conta.getTitular());
	}
}
