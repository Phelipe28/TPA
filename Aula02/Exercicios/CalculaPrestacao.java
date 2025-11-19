import java.util.Scanner;

public class CalculaPrestacao {

	public static void main(String[] args) {
		
		//Scanner:Estrutura pronta do JAVA que permite digirtamos valores 
		Scanner ler = new Scanner(System.in);
		
	    //declaração de variáveis 
		double valor, taxa, tempo, prestacao;
		
		//exibição de valores
		System.out.println("Digite o valor da valor =  ");
		System.out.println("Digite o valor da taxa =  ");
		System.out.println("Digite o valor de tempo =  ");
		valor = ler.nextDouble();
		taxa = ler.nextDouble();
		tempo = ler.nextDouble();
		
		
		//processamento 
		prestacao = valor+(valor*(taxa/100)*tempo);	
		System.out.println("prestação = " +prestacao);
		
		}//fim do método main
	}//fim da classe

