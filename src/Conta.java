
public class Conta {

	private double saldo;
	private double valor;

	public Conta() {
		this.saldo = 0;
	}

	public void depositar(int valor) {
		if (valor < 0) {
			System.out.println("Valor inválido");
		} else {
			this.saldo = saldo + valor;
		}
	}

	public void retirar(int valor) {
		if ((valor > saldo) || (valor < 0)) {
			System.out.println("Valor inválido");
		} else {
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
