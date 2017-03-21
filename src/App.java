
public class App {
	
	public static void main(String[] args) {
		Cliente cl=new Cliente(1);
		System.out.println(cl.toString());
		
		System.out.println("*******************");
		
		Conta c=new Conta();
		c.depositar(5);
		System.out.println(c.getSaldo());
		
		System.out.println("*******************");
		
		c.retirar(2);
		System.out.println(c.getSaldo());
		
		
	}

}
