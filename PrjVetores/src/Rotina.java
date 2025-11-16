import java.util.Scanner;
public class Rotina {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM=10;
		int a[],i,x;
		
		a = new int [TAM];
		
		//leitura do vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(1+i)+"º elemento");
			a[i] = in.nextInt();
		}
		
		System.out.println("Digite o valor que você quer procurar:");
		x = in.nextInt();
		
		//verificação se está armazenado
		for(i=0;i<TAM;i++) {
			if(x==a[i]) {
				System.out.println("o elemento está armazenado no vetor A");
				break;
			}
		}
		
		if(i==TAM) {
			System.out.println("O elemento não está armazenado");
		}
	}

}
