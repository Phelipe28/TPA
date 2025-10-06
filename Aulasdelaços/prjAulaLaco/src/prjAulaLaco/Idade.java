package prjAulaLaco;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=0,id,maior,menor;
		
		maior = 0;
		menor = 0;
	
		
		while(i<5) {
			System.out.println("escreva a idade;");
			id=in.nextInt();		
			
		if(id>18) {
			maior=maior+1;
			
		}else {
			menor=menor+1;
			
		}
      i++;
	}
		System.out.println("os menores de idade são:"+menor);
		System.out.println("os maiores de idade são:"+maior);
	
}
}