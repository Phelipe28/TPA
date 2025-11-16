import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int i,a[],m=0 , soma=0;
		
		a = new int [TAM];
		
		
		//leitura do vetor a 
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(1+i)+"º valor");
			a[i]=in.nextInt();
			soma = a[i]+soma;
			
		}
		m = soma/TAM;
		System.out.println("a media dos valores são:"+m);
	} 

}
