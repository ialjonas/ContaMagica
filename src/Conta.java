
public class Conta {

	private double saldo;
	private double valor;

	public Conta(int valor) {
		depositar(valor);
	}

	public void depositar(int valor) {
		if (valor < 0) {
			System.out.println("Valor inválido");
		} else {
			this.saldo = saldo + valor;
		}
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public String toString(){
		return "Saldo: "+getSaldo();
	}
}
