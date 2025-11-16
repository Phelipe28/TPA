import java.util.Scanner;
public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int a[],i, cont, j;
		
		
		a = new int [TAM];	
		//leitura do vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(1+i)+"º Valor");
			a[i]=in.nextInt();
		}
		
		
		//calculo verificando se é primo
		for (i = 0;i<TAM;i++) {
			cont=0;
			//verificando todos os numeros até o a[i]
			for(j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					cont++;
				}
				
			}
			if(cont == 2) {
				System.out.println("o elemento "+a[i]+" é um numero primo");
			}else
				System.out.println("o elemento "+(1+i)+"º não é um primo");
		}
		
		
		//apresentando o vetor a
		System.out.print("a = [ " );
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("] ");
		in.close();
		
	}
}
