package prjAulaLacoFacaEnq;
import java.util.Scanner;
public class Fibonnaci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o número de termos da série de Fibonacci: ");
        int n = in.nextInt();

        int i=1;
        int a=0;
        int b=1;
        	

        do {
        	System.out.print(a + " ");
        	a = a + b;
        	b = a - b;
        	
            i++;
        } while (i <= n);
		in.close();
	}

}
