package prjAulaDois;
import java.util.*;
public class SalarioMinimo {
      public static void main(String args[]) {
		    Scanner in = new Scanner (System.in);
		    double s;
		    
		    System.out.println("Digite Sal�rio");
		    s= in.nextDouble();
		    if(s>1302) {
		    System.out.println("O sal�rio est� acima do Sal�rio minimo");
		    }else {
		    System.out.println("O sal�rio est� abaixo do sal�rio minimo");
		    }
		    
		    in.close();
		    
      }//fim metodo main
      
}//fim da class
