import java.util.Scanner;

public class Festa {

	public static void main(String[] args) {
		
		//Scanner:Estrutura pronta do java que permite digitarmos valores
		Scanner ler = new Scanner(System.in);
		
		//ler.nextInt();vari�ves do tipo inteira
		//ler.nextDouble();vari�veis do tipo reais
		//ler.next();- vari�veis do tipo caractere
		
	  //Declara��o das vari�veis
	   int homem, mulher, s;
	   double l, b ;
	   
	 //Exibi��o dos valores
	   System.out.println ("Digite o valor de homem: ");
	   homem = ler.nextInt();
	   System.out.println ("Digite o valor de mulher: ");
	   mulher = ler.nextInt();
	   
	   //Processamento
	   b = 100*(homem+mulher)/1000;
	   l = (800*homem+600*mulher)/1000;
	   s = 6*mulher + 10*homem;
	   
	   System.out.println ("b = " + b);
	   System.out.println ("l = " + l);
	   System.out.println ("s = " + s);
	   
	   //Exibi��o dos valores 
	 
	   }//fim do m�todo main
	}//fim da classe 
