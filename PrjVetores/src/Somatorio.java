import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		
		final int TAM=10;
		int a[],i,b[],j,somatorio;
		
		a = new int [TAM];
		b = new int [TAM];
		
		
		// leitura do vetor a
		
		for(j=0;j<TAM;j++) {
			System.out.println("Entre com o "+(1+j)+"º elemento");
			a[j] =in.nextInt();
			
		}
		
		//vetor b calculo
		for(i=0;i<TAM;i++) {
			somatorio = 0;
			//calculo do somatorio
			for (j = i; j <TAM; j++) {
				somatorio = somatorio+a[j];
			}
			b[i]=somatorio;
		}
		
		//apresentação do vetor b
		System.out.print("b=[ ");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("]");
	}

}
