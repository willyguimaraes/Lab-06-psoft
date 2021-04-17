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
	}
	public static void editarCadastro() {
		System.out.println("informe o cpf da pessoa a ser editada: ");
		sc = new Scanner(System.in);
		String cpf = sc.next();
		int dado = UtilMenu.menuEditar();
		controllerPessoas.editarPessoa(cpf, dado);
	}
	

	public static void main(String[] args) {
		
	}

}
