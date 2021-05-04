package vacinacao;

import estados.Estado;
import estados.NaoHabilitada;

public class Pessoa {

	String nome;
	String cpf;
	int idade;
	String endereco;
	String cartaoSUS;
	String email;
	String telefone;
	String profissao;
	String comorbidades;
	Estado status;
	boolean vacina1dose;
	boolean vacina2dose;

	public Pessoa(String nome, String cpf, int idade, String endereco, String cartaoSUS, String email, String telefone,
			String profissao, String comorbidades) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.endereco = endereco;
		this.cartaoSUS = cartaoSUS;
		this.email = email;
		this.telefone = telefone;
		this.profissao = profissao;
		this.comorbidades = comorbidades;
		this.status = new NaoHabilitada();
		this.vacina1dose = false;
		this.vacina2dose = false;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCartaoSUS() {
		return cartaoSUS;
	}

	public void setCartaoSUS(String cartaoSUS) {
		this.cartaoSUS = cartaoSUS;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getComorbidades() {
		return comorbidades;
	}

	public void setComorbidades(String comorbidades) {
		this.comorbidades = comorbidades;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Estado getStatus() {
		return status;
	}

	public void setStatus(Estado status) {
		this.status = status;
	}

	public boolean isVacina1dose() {
		return vacina1dose;
	}

	public void setVacina1dose(boolean vacina1dose) {
		this.vacina1dose = vacina1dose;
	}

	public boolean isVacina2dose() {
		return vacina2dose;
	}

	public void setVacina2dose(boolean vacina2dose) {
		this.vacina2dose = vacina2dose;
	}

	@Override
	public String toString() {
		return "Pessoa:" + "\n" + "nome = " + nome + "\n" + "cpf = " + cpf + "\n" + "idade = " + idade + "\n"
				+ "endereço = " + endereco + "\n" + "cartao do SUS =" + cartaoSUS + "\n" + "email = " + email + "\n"
				+ "telefone = " + telefone + "\n" + "profissão = " + profissao + "\n" + "comorbidades = " + comorbidades
				+ "\n" + "status de vacinação = " + status;
	}

}
