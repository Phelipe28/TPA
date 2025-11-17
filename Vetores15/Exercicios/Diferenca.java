import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int a[],b[],c[],i,j,k,cont;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		//leitura do vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"º elemento do vetor A");
			a[i] = in.nextInt();
		}
				
		//leitura do vetor B
		for(j=0;j<TAM;j++) {
			System.out.println("Entre com o "+(j+1)+"º elemento do vetor B");
			b[j] = in.nextInt();
		}		
		
		k=0;
		//Calculo do vetor C
		for(i=0;i<TAM;i++) {
			cont = 0;
			for(j=0;j<TAM;j++) {
				if(a[i]==b[j]) {
					cont++;
				}
				
				
			}
			if(cont == 0) {
				c[k]=a[i];
				k++;
			}
		}
		
		//apresentação do vetor C
		System.out.print("C=[");
		for(i=0;i<k;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println("]");
	}

}
