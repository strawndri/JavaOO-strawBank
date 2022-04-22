package strawBankEncapsulado;

public class TesteGetSet {
	public static void main(String[] args) {
		
		Conta conta = new Conta();				
		conta.setNumero(123456);
		System.out.println(conta.getNumero());
		
		Cliente cliente = new Cliente();
		conta.setTitular(cliente);
		
		cliente.setNome("Andrieli Luci");
		System.out.println(conta.getTitular().getNome());
		
		// Maneira semelhante de fazer o código acima:
		conta.getTitular().setCpf("111.111.111-11");
		
		System.out.println(conta.getTitular().getCpf());
	}
}
