import java.util.Scanner;

public class Intersencao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[],c[],b[],i,k,j;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		//leitura do vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"º elemento do vetor A");
			a[i] = in.nextInt();
		}
		
		//Leitura do vetor B
		for(j=0;j<TAM;j++) {
			System.out.println("Entre com o "+(j+1)+"º elemento do vetor B");
			b[j] = in.nextInt();
		}
		
		k=0;
		//Calculo vetor C
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
			if(a[i]==b[j]) {
				c[k]=a[i];
				k++;
				break;
			}
		}
		
		}
		System.out.print("C=[");
		//Apresentação do vetor C
		for(i=0;i<k;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
	}

}
/**
 a = [1,2,2,4,5];
 b = [1,4,5,7,8];
 c = [1,4,5]
 */
