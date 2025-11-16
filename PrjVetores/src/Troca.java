import java.util.Scanner;

public class Troca {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int a[],b[],c[],i;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		//Leitura do vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"º elemento do vetor A");
			a[i] = in.nextInt();
		}
		
		//Leitura do vetor B
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"º elemento do vetor B");
			b[i] = in.nextInt();
		}
		
		//Calculo do vetor C
		for(i=0;i<TAM;i++) {
			if(a[i]>b[i]) {
				c[i]=1;
			}
			
			if(a[i]==b[i]) {
				c[i]=0;
			}
			
			if(a[i]<b[i]) {
				c[i]=-1;
			}
		}
		
		//Apresentando o vetor C
		System.out.print("\nc = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
	}

}
