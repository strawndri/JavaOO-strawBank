package strawBankEncapsulado;

class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	// Nome --------------------
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// CPF --------------------
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// Profissão --------------------
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}

