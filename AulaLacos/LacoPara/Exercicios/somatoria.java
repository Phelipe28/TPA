package prjAulaLacoPara;

import java.util.Scanner;

public class somatoria {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int s1=0,somatoria=0;
		
		for (int i=0;i<=400;i=i+5) {
			
			s1= i+0;	
			somatoria = s1+somatoria;
			
			
		}
		
		System.out.println(somatoria);
		in.close();
	}

}
