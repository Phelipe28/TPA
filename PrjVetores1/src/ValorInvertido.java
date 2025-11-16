import java.util.Scanner;
public class ValorInvertido {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM =10;
		int a[],b[],i;
		
		a = new int [TAM];
		b = new int [TAM];
		
		//Leitura do vetor a
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+" º valor");
			a[i]= in.nextInt();
			
		}
		
		//inversao e impressão do vetor b
		System.out.print(" B=[ ");
		for(i=9;i<TAM && i>=0;i--) {
			b[i]=a[i];
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
		in.close();
	}

}