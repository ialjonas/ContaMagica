import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContaTest {

	private Conta cta;

	@Before
	public void setUp() throws Exception {
		cta = new Conta();
		cta.depositar(100);
	}

	@Test
	public void testDepositar() {
		cta.depositar(100);
		assertEquals(200, cta.getSaldo(), 0);
	}
	
	@Test
	public void testDepositarValorInvalido() {
		cta.depositar(-5);
		assertEquals("Valor inválido", 0, 0);
	}
	
	@Test
	public void testRetirar(){
		cta.retirar(50);
		assertEquals(50, cta.getSaldo(),0);
	}
	
	@Test
	public void testRetirarValorInvalido(){
		cta.retirar(300);
		assertEquals("Valor inválido",0,0);
	}

}
