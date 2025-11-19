import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		final int TAM=10;
		
		int i,a[],b[],c[];
		
		a=new int [TAM];
		b=new int [TAM];
		c=new int [TAM];
		
		//leitura do vetor a
		
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"º valor do vetor A");
			a[i]= in.nextInt();
		}
		
		//leitura do vetor 	b	e calculo do vetor c
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"º valor do vetor B");
			b[i]= in.nextInt();
			c[i]=a[i]+b[i];
		}
		System.out.print("c=[ ");
		for(i=0;i<TAM;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
		in.close();
	}

}
