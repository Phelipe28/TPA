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
            	System.out.println("As medidas formam um tri�ngulo");
                if(a==b  && c==b) {
            	  System.out.println("Tipo:tri�ngulo equil�tero");
                }else if(a!=b && b!=c && c!=a) {
            	  System.out.println("Tipo:Tri�ngulo escaleno");
                }else {
            	  System.out.println("Tipo:Tri�ngulo isosceles");
                }
             }else{
            	System.out.println("As medidas n�o formam um tri�ngulo");
             }
           
             }
	        
	    }
	
