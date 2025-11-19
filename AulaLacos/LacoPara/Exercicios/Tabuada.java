package prjAulaLacoPara;
import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i,r,n;
		
		for(i=1; i<=10; i++) {
			n=1;
			r=n*i;
			System.out.println(+i+" x "+n+ " = "+r);
			for(n=2; n<=10; n++) {
				r=n*i;
				System.out.println(+i+" x "+n+ " = "+r);
			}
			System.out.println();
		}
		in.close();
	}

}
