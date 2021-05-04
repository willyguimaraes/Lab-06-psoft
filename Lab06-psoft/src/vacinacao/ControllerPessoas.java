package vacinacao;

import java.util.HashMap;
import java.util.Scanner;
import estados.Estado;

public class ControllerPessoas {

	public static HashMap<String, Pessoa> pessoasCadastradas;
	static Scanner sc;

	public ControllerPessoas() {
		pessoasCadastradas = new HashMap<>();
	}

	public void cadastrarPessoa(String nome, String cpf, int idade, String endereco, String cartaoSUS, String email,
			String telefone, String profissao, String comorbidades) {
		Pessoa pessoa = new Pessoa(nome, cpf, idade, endereco, cartaoSUS, email, telefone, profissao, comorbidades);
		pessoa.getStatus().verificaVacina(pessoa);
		pessoasCadastradas.put(cpf, pessoa);
	}

	public Pessoa localizar(String cpf) {
		Pessoa pessoa = pessoasCadastradas.get(cpf);
		return pessoa;
	}

	public void editarPessoa(String cpf, int dado) {
		Pessoa pessoa = localizar(cpf);
		switch (dado) {
		case 1:
			System.out.println("Informe o novo nome: ");
			sc = new Scanner(System.in);
			String novoNome = sc.next();
			pessoa.setNome(novoNome);
			break;
		case 2:
			System.out.println("Informe o novo cpf: ");
			sc = new Scanner(System.in);
			String novocpf = sc.next();
			pessoa.setCpf(novocpf);
			break;
		case 3:
			System.out.println("Informe a nova idade: ");
			sc = new Scanner(System.in);
			int novaIdade = sc.nextInt();
			pessoa.setIdade(novaIdade);
			break;
		case 4:
			System.out.println("Informe o novo endereço: ");
			sc = new Scanner(System.in);
			String novoend = sc.next();
			pessoa.setEndereco(novoend);
			break;
		case 5:
			System.out.println("Informe o novo numero do cartão do sus: ");
			sc = new Scanner(System.in);
			String novosus = sc.next();
			pessoa.setCartaoSUS(novosus);
			break;
		case 6:
			System.out.println("Informe o novo email: ");
			sc = new Scanner(System.in);
			String novoemail = sc.next();
			pessoa.setEmail(novoemail);
			break;
		case 7:
			System.out.println("Informe o novo telefone: ");
			sc = new Scanner(System.in);
			String novofone = sc.next();
			pessoa.setTelefone(novofone);
			break;
		case 8:
			System.out.println("Informe a nova profissão: ");
			sc = new Scanner(System.in);
			String novaProf = sc.next();
			pessoa.setProfissao(novaProf);
			break;
		case 9:
			System.out.println("Informe a/as nova(s) comorbidade(s): ");
			sc = new Scanner(System.in);
			String novocom = sc.next();
			pessoa.setComorbidades(novocom);
			break;
		}
		pessoa.getStatus().verificaVacina(pessoa);
	}

	public void vacinar(String cpf) {
		Pessoa pessoa = localizar(cpf);
		Estado status = pessoa.getStatus();
		if (status.toString() == "Habilitada para a 1 dose da Vacina") {
			pessoa.setVacina1dose(true);
		} else if (status.toString() == "Habilitada para a 2 dose da Vacina") {
			pessoa.setVacina2dose(true);
		}else {
			System.out.println("pessoa não habilitada para a vacinação");
		}
		pessoa.getStatus().verificaVacina(pessoa);
		
	}

}
