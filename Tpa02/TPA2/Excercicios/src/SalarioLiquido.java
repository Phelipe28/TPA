import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		//Scanner:Estrutura pronta do JAVA que permite digirtamos valores 
		Scanner ler = new Scanner(System.in);
		
	    //declara��o de vari�veis 
		double horaAula, aulaMes, descontoInss, liquido;
		
		//exibi��o de valores
		System.out.println("Digite o valor da horaAula =  ");
		System.out.println("Digite o valor da aulaMes =  ");
		System.out.println("Digite o valor da descontoInss =  ");
		horaAula = ler.nextDouble();
		aulaMes = ler.nextDouble();
		descontoInss = ler.nextDouble();
		
		
		//processamento 
		liquido = aulaMes*horaAula - descontoInss;	
		System.out.println("liquido = " +liquido);
		
		}//fim do m�todo main
	}//fim da classe

