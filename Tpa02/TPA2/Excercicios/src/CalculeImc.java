import java.util.Scanner;
public class CalculeImc {

	public static void main(String[] args) {
		
		//Scanner:Estrutura pronta do java que permite digitarmos valores
		Scanner ler = new Scanner(System.in);
		
		//ler.nextInt();variáves do tipo inteira
		//ler.nextDouble();variáveis do tipo reais
		//ler.next();- variáveis do tipo caractere
		
	  //Declaração das variáveis
	   double imc, altura,peso;
	   
	 //Exibição dos valores
	   System.out.println ("Digite o valor da altura: ");
	   altura= ler.nextDouble();
	   
	   System.out.println ("Digite o valor do peso: ");
	   peso= ler.nextDouble();
	   
	   //Processamento
	   imc = peso/(altura*altura);
	   System.out.println ("imc = " + imc);
	   
	   //Exibição dos valores 
	 
	   }//fim do método main
	}//fim da classe 
