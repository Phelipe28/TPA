package prjAula3;
import java.util.Scanner;
public class triangulo {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a , b ,c;
		
		
		
		 System.out.print("Digite o valor do lado a: ");
	        a = in.nextDouble();

	        System.out.print("Digite o valor do lado b: ");
	        b = in.nextDouble();

	        System.out.print("Digite o valor do lado c: ");
	        c = in.nextDouble();

            if( a<b+c && b<a+c && c<b+a ) { 
            	System.out.println("As medidas formam um triângulo");
                if(a==b  && c==b) {
            	  System.out.println("Tipo:triângulo equilátero");
                }else if(a!=b && b!=c && c!=a) {
            	  System.out.println("Tipo:Triângulo escaleno");
                }else {
            	  System.out.println("Tipo:Triângulo isosceles");
                }
             }else{
            	System.out.println("As medidas não formam um triângulo");
             }
           
             }
	        
	    }
	
