package prjAulaFacaEnquanto;
import java.util.Scanner;
public class Expoente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int i=1;
		int n;
		int e;
		
		System.out.println("coloque um numero");
		n=in.nextInt();
		
		System.out.println("coloque algum epoente");
		e=in.nextInt();
		
		do {
			e=e*i;
			i++;		
		}while(i<=n);
			System.out.println("escreva a potencia da"+n+" "+e);	
	}

}
