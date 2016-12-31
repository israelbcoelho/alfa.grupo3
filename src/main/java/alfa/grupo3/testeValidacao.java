package alfa.grupo3;

public class testeValidacao {

	public static void main(String[] args) {

		validador validarCPF = new validador();
		String CPF = "93801890104";
		
		   if (validarCPF.isCPF(CPF) == true)
		       System.out.printf("%s\n", validarCPF.imprimeCPF(CPF));
		    else System.out.printf("Erro, CPF invalido !!!\n");		
		
	}
	
}
