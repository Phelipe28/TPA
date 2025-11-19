package prjAulaLaco;
import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=1,n,t;
		
		System.out.println("Escreva o numero da tabuada:");
		n=in.nextInt();
	
		
		while(i<=10) {
			t=n*i;
			
			System.out.println(n+"x"+i+"="+t);
			i++;

		}
		
	}

}
