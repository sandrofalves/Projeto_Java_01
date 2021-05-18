public class ContaCorrente extends Conta {
	private final double DESCONTO = 5; 

	//Toda vez que cair um deposito ser� descontado o valor.
//	public double getDesconto() {
//		return DESCONTO;
//	}
	
	@Override
	public void depositar(double valor) {
		this.setSaldo(getSaldo() + (valor - DESCONTO));
		System.out.println("Deposito Realizados com Sucesso Na Conta Corrente!!! \n");		
	}
	
	@Override
	public void sacar(double valor) {

		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("");
			System.out.println("Saque Realizado com Sucesso na Conta Corrente! \n");
		} else {
			System.out.println("Saldo insuficiente");
		}

	}	

	@Override
	public void exibirSaldo() {
		System.out.println("Voce est� em na Classe ContaCorrente, Seu Saldo �: " + this.getSaldo());		
	}
	
	
	public void transferir(double valor, ContaCorrente contaDestino) {

		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("");
			System.out.println("Transfer�ncia Realizada com Sucesso!");
			System.out.printf("Valor de: %.2f  \n", valor);
			System.out.println("Destino: " + contaDestino.getDono()+ " Numero: " + contaDestino.getNumero());
		} else {
			System.out.println("Saldo insuficiente");
		}

	}
	

}
