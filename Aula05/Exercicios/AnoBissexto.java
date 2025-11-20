package prjAula4;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int tf=0,anoInicial,anoFinal, i=1;
		
			System.out.println("Digite o ano inicial");
			anoInicial=in.nextInt();
			System.out.println("Digite o ano Final");
			anoFinal=in.nextInt();
			
			i=anoFinal-anoInicial;
			while(i>=0) {
				if(anoInicial%4==0) {
					System.out.println(anoInicial+" Ano bissexto");
					tf=tf+1;
				}
				
				anoInicial++;
				
					
				i--;
			}
			System.out.println(tf);
			in.close();
	}
	
}
