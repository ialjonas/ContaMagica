
public class Conta {

	Cliente c=new Cliente(1);
	private double saldo;
	private double valor;

	public Conta() {
		this.saldo = 0;
	}

	public void depositar(int valor) {
		if (valor < 0) {
			System.out.println("Valor inv�lido");
		} else {
			this.saldo = saldo + valor;
			/**
			 * A valida��o da categoria do cliente sera realizada aqui.
			 */
			
			//if (saldo<)
		}
	}

	public void retirar(int valor) {
		if ((valor > saldo) || (valor < 0)) {
			System.out.println("Valor inv�lido");
		} else {
			/**
			 * A valida��o da categoria do cliente sera realizada aqui.
			 */
			this.saldo = saldo - valor;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public String toString() {
		return "Saldo: " + getSaldo();
	}
}
