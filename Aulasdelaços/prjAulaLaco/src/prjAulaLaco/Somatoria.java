package prjAulaLaco;

import java.util.Scanner;

public class Somatoria {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=1,s=0;
		 
		 while (i <= 100) {
			 System.out.println(s=s+1);
	            s=s+i;
	            
	            i++;
		}
		 System.out.println("A somat�ria de 1 a 100 �: " + s);
	}

}
