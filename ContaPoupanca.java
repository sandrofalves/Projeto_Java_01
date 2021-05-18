
public class ContaPoupanca extends Conta {
	int variacao;
	double juros = 0.02;// 2 % do valor

	public int getVariacao() {
		return variacao;
	}

	public void setVariacao(int variacao) {
		this.variacao = variacao;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	@Override
	public void depositar(double valor) {
		this.setSaldo(getSaldo() + (valor + (juros * valor)));
		System.out.println("Deposito Realizados com Sucesso Na Poupanca!!! \n");

	}

	@Override
	public void sacar(double valor) {

		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("");
			System.out.println("Saque Realizado com Sucesso na Conta Poupanca! \n");
		} else {
			System.out.println("Saldo insuficiente");
		}

	}

	@Override
	public void exibirSaldo() {
		System.out.println("Voce está em na Classe ContaPoupanca, Seu Saldo é: " + this.getSaldo());

	}

}
