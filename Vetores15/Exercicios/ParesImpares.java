import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 20;
		
		int a[],b[],i,pares,impares;
		
		a = new int [TAM];
		b = new int [TAM];
		
		//leitura do vetor a
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(1+i)+"º elemento do vetor A");
			a[i] = in.nextInt();
		}
		
		pares=0;
		impares=19;
		//calculo do vetor b
		for(i=0;i<TAM;i++) {
			if(a[i]%2==0) {
				b[pares]=a[i];
				pares++;
			}
			if(a[i]%2!=0) {
				b[impares]=a[i];
				impares--;
			}
		}
		
		//leitura do vetor b
		System.out.print("B=[ ");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
	}

}
