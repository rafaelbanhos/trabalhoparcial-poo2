
public class Excecao {	 // 8 - Tratamento Exceção
	static void checarIdade(int idade) { 
	    if (idade < 16) {
	      throw new ArithmeticException("Entrada proibida - Cliente tem menos de 16 anos."); 
	    }
	    else {
	      System.out.println("Acesso permitido - Cliente tem mais de 16 anos!"); 
	    }
	  }
}
