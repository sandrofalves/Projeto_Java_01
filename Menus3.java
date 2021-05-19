
public class Menus {
	private int op;
	private boolean status;

	public void MenuPrincipal() {
		System.out.println("Menu Principal IBank");
		System.out.println("");
		System.out.println("1 - Abra sua Conta;");
		System.out.println("2 - Consulta Saldo;");
		System.out.println("3 - Deposito;");
		System.out.println("4 - Saque;");
		System.out.println("5 - Transferência;");
		System.out.println("6 - Sair;");
		System.out.println("");
		System.out.println("Esolha uma das Opções:");
	}

	public void setOp(int op) {
		this.op = op;
//		this.ValidaOpcaoPrincipal(op);
	}

	public int getOp() {
		return op;
	}

	public boolean ValidaOpcaoPrincipal(int op) {
		this.op = op;

		if (this.op == 6) {
			System.out.println("");
			System.out.println("Obrigado e Até Mais...");
			this.status = false;
		}

		if (this.op < 1 || this.op >= 7) {
			System.out.println("Opcao inválida");
			this.status = true;
		}

		if (this.op >= 1 && this.op <= 5) {
			this.status = true;
		}

		return this.status;

	}
	
	public void MenuSaldo(double valContaCorrente, double valContaPoupanca ) {		
		System.out.printf("valor Conta Corrente: %.2f \n", valContaCorrente);
		System.out.printf("valor Conta Poupanca: %.2f \n", valContaPoupanca);
		System.out.println("");
	}

}
