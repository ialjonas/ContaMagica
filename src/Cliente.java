
public class Cliente {
	private String categoria;
	
	public Cliente(int tipo){
		setCategoria(tipo);
	}
	
	public void setCategoria(int tipo){
		switch (tipo) {
		case 1:
			categoria="Silver";
			break;
		case 2:
			categoria="Gold";
			break;
		case 3:
			categoria="Platinum";
			break;
		default:
			break;
		}
	}
	
	public String getCategoria(){
		return categoria;
	}
	
	public String toString(){
		return "Cliente na categoria: " + getCategoria()+".";
	}

}
