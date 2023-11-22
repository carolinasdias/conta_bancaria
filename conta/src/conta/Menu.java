package conta;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;
		
				
				
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Felipe", 100000.0f, 2000.00f);
		cc1.visualizar();
		cc1.sacar(101000.00f);
		cc1.visualizar();
		cc1.depositar(1000.00f);
		cc1.visualizar();
	
		ContaPoupanca c2 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		c2.visualizar();
        c2.sacar(1000.0f);
		c2.visualizar();
		c2.depositar(5000.0f);
		c2.visualizar();
		
				
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHILE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHILE_BOLD + "Criar Conta\n\n");

					break;
				case 2:
					System.out.println(Cores.TEXT_WHILE_BOLD + "Listar todas as Contas\n\n");

					break;
				case 3:
					System.out.println(Cores.TEXT_WHILE_BOLD + "Consultar dados da Conta - por número\n\n");

					break;
				case 4:
					System.out.println(Cores.TEXT_WHILE_BOLD + "Atualizar dados da Conta\n\n");

					break;
				case 5:
					System.out.println(Cores.TEXT_WHILE_BOLD + "Apagar a Conta\n\n");

					break;
				case 6:
					System.out.println(Cores.TEXT_WHILE_BOLD + "Saque\n\n");

					break;
				case 7:
					System.out.println(Cores.TEXT_WHILE_BOLD + "Depósito\n\n");

					break;
				case 8:
					System.out.println(Cores.TEXT_WHILE_BOLD + "Transferência entre Contas\n\n");

					break;
				default:
					System.out.println(Cores.TEXT_WHILE_BOLD + "\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Carolina Dias");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("https://github.com/carolinasdias/conta_bancaria");
		System.out.println("*********************************************************");
	}
}