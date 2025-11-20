package prjAulaDois;
import java.util.*;
public class SalarioMinimo {
      public static void main(String args[]) {
		    Scanner in = new Scanner (System.in);
		    double s;
		    
		    System.out.println("Digite Salário");
		    s= in.nextDouble();
		    if(s>1302) {
		    System.out.println("O salário está acima do Salário minimo");
		    }else {
		    System.out.println("O salário está abaixo do salário minimo");
		    }
		    
		    in.close();
		    
      }//fim metodo main
      
}//fim da class
