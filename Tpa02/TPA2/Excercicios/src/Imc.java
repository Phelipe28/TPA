
public class Imc {

	public static void main(String[] args) {
	    //declaração de variáveis 
		int altura,imc,peso;
		
		//atribuições de valores
		peso = 70;
		altura= 2;
		
		//processamento 
		imc = peso /(altura*altura);
		
		//exibição de valores
		
		System.out.println("imc = " +imc);
		
		System.out.println(peso+ " / "+(altura*altura)+ " = "+imc);
		
		}//fim do método main
	}//fim da classe

