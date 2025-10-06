package prjAulaLacoFacaEnq;
import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		
		int i=1,n,f=1;
		
		
		System.out.println("Escreva um numero");
		n = in.nextInt();
		
		do {
			f = f*i;
			i++;			
		}while (i<=n);
		 
		System.out.println("O fatorial do "+n+" é: "+f);
		in.close();
	}

}
