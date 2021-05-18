import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();
		ContaCorrente tr1 = new ContaCorrente();
		
		Menus menu = new Menus();
		String contaDep;
		String contaSaq;
		double valorDep;
		double valorSaq;
		double valorTransf;

		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		Scanner scDouble = new Scanner(System.in);
		do {

			menu.MenuPrincipal();
			menu.setOp(scInt.nextInt());

			switch (menu.getOp()) {
			case 1: // -- Abra sua Conta --//
				System.out.println("Informe o Nome:");
				cc1.setDono(scString.nextLine());

				System.out.println("Informe a Agencia:");
				cc1.setAgencia(scString.nextLine());

				System.out.println("Informe o Numero:");
				cc1.setNumero(scInt.nextInt());

				// -- atribui os mesmos valores de Conta Corrente para Conta Poupança --//
				cp1.setDono(cc1.getDono());
				cp1.setAgencia(cc1.getAgencia());
				cp1.setNumero(cc1.getNumero());
				System.out.println("");
				System.out.println("Seja bem Vindo: " + cc1.getDono());
				break;

			case 2:// -- Consulta Saldo --//
				menu.MenuSaldo(cc1.getSaldo(), cp1.getSaldo());
				break;

			case 3:// -- Deposito --//
				System.out.println("Informe Conta de Deposito(P,C):");
				contaDep = scString.nextLine().toUpperCase();

				System.out.println("Informe Valor:");
				valorDep = scDouble.nextDouble();

				if (contaDep.equals("P") || contaDep.equals("C")) {

					if (contaDep.equals("P")) {
						cp1.depositar(valorDep);
					}

					if (contaDep.equals("C")) {
						cc1.depositar(valorDep);
					}

				} else {
					System.out.println("Opção Inválida!");
					System.out.println("Refaça a Operação");
					System.out.println("");
				}

				break;
			case 4: //-- Saque
				
				System.out.println("Informe Tipo de Conta para Saque(P,C):");
				contaSaq = scString.nextLine().toUpperCase();

				System.out.println("Informe Valor:");
				valorSaq = scDouble.nextDouble();

				if (contaSaq.equals("P") || contaSaq.equals("C")) {

					if (contaSaq.equals("P")) {
						cp1.sacar(valorSaq);
					}

					if (contaSaq.equals("C")) {
						cc1.sacar(valorSaq);
					}

				} else {
					System.out.println("Opção Inválida!");
					System.out.println("Refaça a Operação");
					System.out.println("");
				}
				
				
				break;
			case 5: // Transferencia
				System.out.println(" -- Coloque abaixo as Informações Para a Conta de Destino -- ");
				System.out.println("Informe o Nome:");
				tr1.setDono(scString.nextLine());

				System.out.println("Informe a Agencia:");
				tr1.setAgencia(scString.nextLine());

				System.out.println("Informe o Numero:");
				tr1.setNumero(scInt.nextInt());

				System.out.println("Informe o Valor a ser Transferido da Conta Corrente:");
				valorTransf = scDouble.nextDouble();
				
				cc1.transferir(valorTransf, tr1);				
				break;
			default:
				System.out.println("Digite SOMENTE números entre 1 e 4");
				break;
			}

		} while (menu.ValidaOpcaoPrincipal(menu.getOp()));

		scInt.close();
		scString.close();
		scDouble.close();

		/*
		 * cc1.setAgencia("1835"); cc1.setNumero(272078); cc1.setDono("Sandro");
		 * cc1.setSaldo(2500);
		 * 
		 * cp1.setAgencia("1835"); cp1.setNumero(272078); cp1.setDono("Sandro");
		 * cp1.setSaldo(2500);
		 * 
		 * cp1.setVariacao(51); cp1.setJuros(0.5);
		 */

	}

}
