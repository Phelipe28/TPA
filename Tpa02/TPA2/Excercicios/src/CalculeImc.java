import java.util.Scanner;
public class CalculeImc {

	public static void main(String[] args) {
		
		//Scanner:Estrutura pronta do java que permite digitarmos valores
		Scanner ler = new Scanner(System.in);
		
		//ler.nextInt();vari�ves do tipo inteira
		//ler.nextDouble();vari�veis do tipo reais
		//ler.next();- vari�veis do tipo caractere
		
	  //Declara��o das vari�veis
	   double imc, altura,peso;
	   
	 //Exibi��o dos valores
	   System.out.println ("Digite o valor da altura: ");
	   altura= ler.nextDouble();
	   
	   System.out.println ("Digite o valor do peso: ");
	   peso= ler.nextDouble();
	   
	   //Processamento
	   imc = peso/(altura*altura);
	   System.out.println ("imc = " + imc);
	   
	   //Exibi��o dos valores 
	 
	   }//fim do m�todo main
	}//fim da classe 
