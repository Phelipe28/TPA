import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
	    //declara��o de vari�veis 
		int s,inss,vale,liquido;
		
		//exibi��o de valores
		System.out.println("digite o valor do sal�rio= ");
		s = ler.nextInt();
		
		//processamento 
		inss = s * 8/100;
		vale = s * 6/100;
		liquido = s-inss-vale;
		System.out.println("liquido = " +liquido);
		
		}//fim do m�todo main
	}//fim da classe

