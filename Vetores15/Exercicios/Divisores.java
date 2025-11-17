import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM=10;
		int a[],i,d;
		
		a = new int [TAM];
		
		
		d=0;
		//leitura do vetor a e verificação dos divisores
		for(i=0;i<TAM;i++) {
			System.out.println("\nEntre com o "+(1+i)+"º elemento");
			a[i]=in.nextInt();
			System.out.print("os divisores do "+(1+i)+"º elemento são: ");
			for(d=1;d<=a[i];d++) {
				if(a[i]%d==0) {
					System.out.print(+d+" ");
					
				}
			};
			
		}
		
		
		System.out.print("\nA = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		in.close();
	}

}
