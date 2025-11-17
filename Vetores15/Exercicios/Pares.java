import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int a[],i,j;
		
		a = new int [TAM];
	
		//leitura do vetor a e verificação dos pares
		for(i=0;i<TAM;i++) {
			System.out.println("\nEntre com o "+(1+i)+"º elemento");
			a[i]=in.nextInt();
			//calculando os pares para numeros com resto 0
			if(a[i]%2==0) {
				System.out.print("o pares até o elemento "+(1+i)+"º são: ");
				for(j=0;j<=a[i];j=j+2) {
					System.out.print(+j+" ");
				}
				//calculando os pares para numeros de resto diferente de 0
			}else if(a[i]%2!=0){
				System.out.print("o pares até o elemento "+(1+i)+"º são: ");
				for(j=0;j<a[i];j=j+2) {
					
					System.out.print(+j+" ");
				}
			}
		}
		
		
		//apresentando o vetor A
		System.out.print("\nA = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print(" ]");
		in.close();		
	}

}
