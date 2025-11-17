import java.util.Scanner;

public class UmParImpar {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM=10;
		int a[],b[],i;
		
		a = new int [TAM];
		b = new int [TAM];
		
		
		//leitura do vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"º elemento do vetor A");
			a[i] = in.nextInt();
			
		}
		
		//Calculo do vetor B
		for(i=0;i<TAM;i++) {
			if(a[i]%2==0) {
				b[i]=1;
			}
			if(a[i]%2!=0) {
				b[i]=0;
			}
		}
		//Apresentando o vetor B
		System.out.print("\nb = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		
		
	}

}
