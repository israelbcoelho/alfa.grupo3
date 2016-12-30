package alfa.grupo3;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class validadorTeste {
	
	public static void main(String[] args) {
		validadorTeste testeCPF = new validadorTeste();
		testeCPF.testeCPF1_0();
	}

	@Test
	public void testeCPF1_0() {
		//Teste com CPF Valido
		validador validar = new validador();
		boolean cpfValido = validar.isCPF("93801890104");
		Assert.assertEquals(true, cpfValido = true);
	}

	@Test
	public void testeCPF1_1() {
		validador validar = new validador();
		boolean cpfValido = validar.isCPF("93801890101");
		Assert.assertEquals(false, cpfValido);;
	}

	@Test
	public void testeCPF2_0() {
		//Teste com CPF Valido
		validador validar = new validador();
		boolean cpfValido = validar.isCPF("44746487901");
		Assert.assertEquals(true, cpfValido = true);
	}

	@Test
	public void testeCPF2_1() {
		//CPF invalido
		validador validar = new validador();
		boolean cpfValido = validar.isCPF("44746487902");
		Assert.assertEquals(false, cpfValido);;
	}
	

	
	
}
