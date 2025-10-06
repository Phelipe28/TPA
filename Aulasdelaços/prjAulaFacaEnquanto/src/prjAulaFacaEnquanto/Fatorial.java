package prjAulaFacaEnquanto;
import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n;
		System.out.println("escreva o numero:");
		n=in.nextInt();
		
		int f = 1;

		int i=1;
		
		do {
			f = f*i;
			i++;
		}while(i<=n);
		System.out.println("o fatorial do "+n+" é "+f);
	}

}
