package prjAulaDois;
import java.util.*;
public class Clima {
          public static void main(String[] args) {
		      Scanner in = new Scanner (System.in);
		      double f , c;
		    System.out.println("digite a temperatura em fahrenheit");
		    f = in.nextDouble();
		    
		    c = (f-32)/1.8;
		    System.out.println("Apresente o valor convertido de celcius="  +c);
		    
		    
		    if(c<0) {
		    System.out.println("Est� um frio extremo");
		    }else if (c<=10) {
		    	System.out.println("Est� frio");
		    }else if (c<=20 ) {
		    	System.out.println("Est� um frio moderado");
		    }else if (c<=24){
		    	System.out.println("Est� um clima ameno");
		    }else {
		    System.out.println("Est� calor");} 
		}  
          
}

