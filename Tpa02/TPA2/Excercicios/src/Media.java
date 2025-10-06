import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		//Scanner:Estrutura pronta do JAVA que permite digirtamos valores 
		Scanner ler = new Scanner(System.in);
		
	    //declaração de variáveis 
		double nota1, nota2, nota3, nota4, media;
		
		//exibição de valores
		System.out.println("Digite o valor da nota1 =  ");
		System.out.println("Digite o valor da nota2 =  ");
		System.out.println("Digite o valor da nota3 =  ");
		System.out.println("Digite o valor da nota4 =  ");
		nota1 = ler.nextDouble();
		nota2 = ler.nextDouble();
		nota3 = ler.nextDouble();
		nota4 = ler.nextDouble();
		
		
		//processamento 
		media = (nota1+nota2+nota3+nota4)/4;	
		System.out.println("media = " +media);
		
		}//fim do método main
	}//fim da classe

