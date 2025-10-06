package prjAulaDois;
import java.util.*;
public class Temperatura {
	 public static void main(String args[]) {
      Scanner in = new Scanner  (System.in);
	  double f,c;
	  
	  System.out.println("digite o valor de fahrenheit");
	  f= in.nextDouble();
	  c = (f-32)/1.8;
	  System.out.println("o valor de celsius é:"+c);
	  if(c<15) {
		  System.out.println("A temperatura está fria");
	  }else if (c<22) {
		  System.out.println("A temperatura está ameno");
	  }else
		  
		  System.out.println("A temperatura está quente");
	  
	 }//fim do método main

}//fim da class