import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM=15;
		int a[],b[],i,j,fatorial;
		
		a = new int [TAM];
		b = new int [TAM];
		
		//Leitura do vetor a
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(1+i)+"º elemento");
			a[i]=in.nextInt();
			b[i]=a[i];
		}
		
		//apresentação do vetor a
		System.out.print("A=[ ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		
		//calculo do vetor b
		for(i=0;i<TAM;i++) {
			fatorial = 1;
			//calculo fatorial
			for(j=a[i];j>1;j--) {
				fatorial = fatorial*j;
			}
			b[i] = fatorial;
			
		}
		
		//apresentação do vetor b
		System.out.print("B=[ ");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("]");

		
		
	}

}

