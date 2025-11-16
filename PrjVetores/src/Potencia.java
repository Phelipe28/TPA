import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM=11;
		int a[],i,p,s;
		
		
		a = new int[TAM];
		
		//leitura do vetor a e calculo da potencia
		for(i=0;i<TAM;i++) {
			System.out.println("digite o "+i+"º elemento");
			a[i]=in.nextInt();
			s=1;// reinicia antes de calcular cada potência
			
			//calculo da potência
			for(p=1;p<=a[i];p++) {
				s = 2*s;
				
			}
			System.out.println("A potêcia da base 2 do vetor A [ "+a[i]+" ]"+" = "+s);	
			
		}
		in.close();	
	}

}

