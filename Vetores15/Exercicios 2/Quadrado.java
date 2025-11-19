import java.util.Scanner;
public class Quadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10; // Definindo uma constante de tamanho 10
		int a[],b[],i;
		
		a = new int[TAM];
		b = new int[TAM];
		
		
		//Leitura do vetor a e calculo do vetor b
		
		for(i=0;i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor");
			a[i]= in.nextInt();
			b[i]= a[i]*a[i];
		}
		//Apresentação do vetor b
		System.out.print("b = [ ");
		for(i=0;i<TAM; i++) {
			System.out.print(+b[i]+" ");
		}
		System.out.print("]");
		in.close();
	}
}