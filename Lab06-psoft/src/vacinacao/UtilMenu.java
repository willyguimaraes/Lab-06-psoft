package vacinacao;

import java.util.Scanner;

public class UtilMenu {
	
	static Scanner sc;

	public UtilMenu() {
	}
	
	public static String menuNome() {
		System.out.println("Nome completo: ");
		sc = new Scanner(System.in);
		String nome = sc.next();
		return nome;
	}
	
	public static String menuCpf() {
		System.out.println("CPF: ");
		sc = new Scanner(System.in);
		String cpf = sc.next();
		return cpf;
	}
	
	public static int menuIdade() {
		System.out.println("idade: ");
		sc = new Scanner(System.in);
		int idade = sc.nextInt();
		return idade;
	}
	
	public static String menuEndereco() {
		System.out.println("endereço: ");
		sc = new Scanner(System.in);
		String endereco = sc.next();
		return endereco;
	}
	
	public static String menuCartaoSUS() {
		System.out.println("Numero do cartão do sus: ");
		sc = new Scanner(System.in);
		String sus = sc.next();
		return sus;
	}
	
	public static String menuEmail() {
		System.out.println("Email: ");
		sc = new Scanner(System.in);
		String email = sc.next();
		return email;
	}
	
	public static String menuTelefone() {
		System.out.println("Numero de telefone: ");
		sc = new Scanner(System.in);
		String fone = sc.next();
		return fone;
	}
	
	public static String menuProfissao() {
		System.out.println("Profissão: ");
		sc = new Scanner(System.in);
		String prof = sc.next();
		return prof;
	}
	
	public static String menuComorbidades() {
		System.out.println("possui comorbidades? se sim quais?: ");
		sc = new Scanner(System.in);
		String com = sc.next();
		return com;
	}
	
	public static int menuEditar() {
		System.out.println("digite 1 para editar o nome");
		System.out.println("digite 2 para editar o cpf");
		System.out.println("digite 3 para editar a idade");
		System.out.println("digite 4 para editar o endereço");
		System.out.println("digite 5 para editar o cartão do sus");
		System.out.println("digite 6 para editar o email");
		System.out.println("digite 7 para editar o telefone");
		System.out.println("digite 8 para editar a profissão");
		System.out.println("digite 9 para editar as comorbidades");
		sc = new Scanner(System.in);
		int dado = sc.nextInt();
		return dado;
	}

}
