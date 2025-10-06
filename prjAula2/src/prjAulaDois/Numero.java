package prjAulaDois;
import java.util.*;
public class Numero {
	 public static void main(String args[]) {
            Scanner in = new Scanner (System.in);
	        double n1;
	        
	        System.out.println("Digite o número");
	        n1 = in.nextDouble();
	        if(n1==0) {
	        	System.out.println("Neutro");
	        }else if (n1>0) {
	        	System.out.println("Positivo");
	        }else {
	        	System.out.println("Negativo");
	        }
	 
	 }
	 
	 
}