package vacinacao;

import java.util.Scanner;

public class Main {

	static UtilMenu menu;
	static ControllerPessoas controllerPessoas = new ControllerPessoas();
	static Scanner sc;

	public Main() {
	}

	public static void cadastrarPessoa() {
		String nome = UtilMenu.menuNome();
		String cpf = UtilMenu.menuCpf();
		int idade = UtilMenu.menuIdade();
		String endereco = UtilMenu.menuEndereco();
		String sus = UtilMenu.menuCartaoSUS();
		String email = UtilMenu.menuEmail();
		String telefone = UtilMenu.menuTelefone();
		String profissao = UtilMenu.menuProfissao();
		String comorbidades = UtilMenu.menuComorbidades();
		controllerPessoas.cadastrarPessoa(nome, cpf, idade, endereco, sus, email, telefone, profissao, comorbidades);
		System.out.println("pessoa cadastrada com sucesso!");
		System.out.println(" ");
	}

	public static void editarCadastro() {
		System.out.println("informe o cpf da pessoa a ser editada: ");
		sc = new Scanner(System.in);
		String cpf = sc.next();
		int dado = UtilMenu.menuEditar();
		controllerPessoas.editarPessoa(cpf, dado);
	}

	public static void consultarPessoa() {
		System.out.println("informe o cpf da pessoa a ser consultada: ");
		sc = new Scanner(System.in);
		String cpf = sc.next();
		Pessoa pessoa = controllerPessoas.localizar(cpf);
		System.out.println(pessoa.toString());
		System.out.println(" ");
	}
	
	public static void vacinar() {
		System.out.println("informe o cpf da pessoa: ");
		sc = new Scanner(System.in);
		String cpf = sc.next();
		controllerPessoas.vacinar(cpf);
		System.out.println("Vacinação resistrada com sucesso");
		
		
	}

	public static void menu() {
		System.out.println("1 - Cadastrar uma pessoa \n" + "2 - Editar um cadastro \n"+ "3 - Consultar um cadastro \n"
				+ "4 - Resistrar vacinação");
		sc = new Scanner(System.in);
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			cadastrarPessoa();
			break;
		case 2:
			editarCadastro();
			break;
		case 3:
			consultarPessoa();
			break;
		case 4:
			vacinar();
			break;
		}
		System.out.println(" ");
		System.out.println("o que deseja fazer agora?");
		menu();

	}

	public static void main(String[] args) {
		System.out.println("Bem vindo(a)!");
		menu();

	}

}
