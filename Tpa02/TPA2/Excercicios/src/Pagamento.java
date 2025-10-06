import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		
		//Scanner:Estrutura pronta do java que permite digitarmos valores
		Scanner ler = new Scanner(System.in);
		
		//ler.nextInt();variáves do tipo inteira
		//ler.nextDouble();variáveis do tipo reais
		//ler.next();- variáveis do tipo caractere
		
	  //Declaração das variáveis
	   int p, d, a, pix, c;
	   
	 //Exibição dos valores
	   System.out.println ("Digite o preço do produto vendido: ");
	   p= ler.nextInt();
	   
	   //Processamento
	   d = p*10/100;
	   a = p*5/100;
	   pix = p-d;
	   c = p+a;
	   System.out.println ("pix = "+ pix);
	   System.out.println ("c = " + c);
	   //Exibição dos valores 
	 
	   }//fim do método main
	}//fim da classe 
