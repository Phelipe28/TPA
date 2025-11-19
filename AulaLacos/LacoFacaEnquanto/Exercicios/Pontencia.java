package prjAulaLacoFacaEnq;
import java.util.Scanner;
public class Pontencia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int b;
		int i = 0;
		int resultado = 1;
		int e;
		System.out.println("Digite um numero:");
		b = in.nextInt();
		System.out.println("Digite um expoente:");
		e = in.nextInt();
		
		if (e==0){
			resultado=1;
			
		}else
			do {
				resultado = resultado * b;
				i++;
			}while(i<e);
		System.out.println("o resultado da potência= "+ resultado);
			
			
		in.close();
		/**
		 5^4 = 5x5x5x5 = 625
		 */
	}

}
