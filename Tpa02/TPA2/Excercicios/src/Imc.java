
public class Imc {

	public static void main(String[] args) {
	    //declara��o de vari�veis 
		int altura,imc,peso;
		
		//atribui��es de valores
		peso = 70;
		altura= 2;
		
		//processamento 
		imc = peso /(altura*altura);
		
		//exibi��o de valores
		
		System.out.println("imc = " +imc);
		
		System.out.println(peso+ " / "+(altura*altura)+ " = "+imc);
		
		}//fim do m�todo main
	}//fim da classe

