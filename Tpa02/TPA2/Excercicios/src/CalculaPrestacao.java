import java.util.Scanner;

public class CalculaPrestacao {

	public static void main(String[] args) {
		
		//Scanner:Estrutura pronta do JAVA que permite digirtamos valores 
		Scanner ler = new Scanner(System.in);
		
	    //declara��o de vari�veis 
		double valor, taxa, tempo, prestacao;
		
		//exibi��o de valores
		System.out.println("Digite o valor da valor =  ");
		System.out.println("Digite o valor da taxa =  ");
		System.out.println("Digite o valor de tempo =  ");
		valor = ler.nextDouble();
		taxa = ler.nextDouble();
		tempo = ler.nextDouble();
		
		
		//processamento 
		prestacao = valor+(valor*(taxa/100)*tempo);	
		System.out.println("presta��o = " +prestacao);
		
		}//fim do m�todo main
	}//fim da classe

