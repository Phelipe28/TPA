import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		
		//Scanner:Estrutura pronta do java que permite digitarmos valores
		Scanner ler = new Scanner(System.in);
		
		//ler.nextInt();vari�ves do tipo inteira
		//ler.nextDouble();vari�veis do tipo reais
		//ler.next();- vari�veis do tipo caractere
		
	  //Declara��o das vari�veis
	   int p, d, a, pix, c;
	   
	 //Exibi��o dos valores
	   System.out.println ("Digite o pre�o do produto vendido: ");
	   p= ler.nextInt();
	   
	   //Processamento
	   d = p*10/100;
	   a = p*5/100;
	   pix = p-d;
	   c = p+a;
	   System.out.println ("pix = "+ pix);
	   System.out.println ("c = " + c);
	   //Exibi��o dos valores 
	 
	   }//fim do m�todo main
	}//fim da classe 
