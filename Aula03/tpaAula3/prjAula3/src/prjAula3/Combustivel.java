package prjAula3;
import java.util.*;
public class combustivel {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double d , capacidade, gasto ;
		
		System.out.println("Digite a dist�ncia percorrida em km:");
		d = in.nextDouble();
		
		System.out.println("Digite a capacidade do tanque em litros:");
		capacidade = in.nextDouble();
		
		gasto = d/capacidade;
	    System.out.println("Apresente o gasto m�dio:"+gasto + "km/L");
	    
	    if(gasto>=10) {
	    	System.out.println("Carro econ�mico");
	    }else
	    	System.out.println("Carro n�o econ�mico");
		
		
	}
	
}
