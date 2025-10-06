import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
	    //declaração de variáveis 
		int s,inss,vale,liquido;
		
		//exibição de valores
		System.out.println("digite o valor do salário= ");
		s = ler.nextInt();
		
		//processamento 
		inss = s * 8/100;
		vale = s * 6/100;
		liquido = s-inss-vale;
		System.out.println("liquido = " +liquido);
		
		}//fim do método main
	}//fim da classe

