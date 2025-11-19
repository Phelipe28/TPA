import java.util.Scanner;
public class VolumeCubo {

	public static void main(String[] args) {
		
		//Scanner:Estrutura pronta do JAVA que permite digirtamos valores 
		Scanner ler = new Scanner(System.in);
		
	    //declaração de variáveis 
		int l,volume;
		
		//exibição de valores
		System.out.println("Digite o valor do volume =  ");
		l = ler.nextInt();
		
		//processamento 
		volume = l*l*l;	
		System.out.println("volume = " +volume);
		
		}//fim do método main
	}//fim da classe

