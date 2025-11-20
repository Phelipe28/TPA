package prjAulaDois;
import java.util.*;
public class NumeroImparPar {
          public static void main(String args[]) {
        	  Scanner in = new Scanner (System.in);
        	  int n1;
        	  
        	  System.out.println("digite o numero inteiro");
        	  n1 = in.nextInt();
        	  
        	  if(n1%2==0) {
        		  System.out.println("O numero é par");
        	  }else {
        		  System.out.println("o numero é impar");}
        
          }
          
}
