import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		final int TAM=5;
		int a[],i,resultado,n;
		 
		a= new int[TAM];
		
		for(i=0;i<5;i++) {
			System.out.println("Entre com o "+(1+i)+"º valor pra a tabuada");
			a[i]=in.nextInt();
			for(n=1;n<=10;n++) {
				resultado = a[i]*n;
				System.out.println(+a[i]+" X "+n+" = "+resultado);
			}
			System.out.println("===========================================");
		}
		
	}
}
