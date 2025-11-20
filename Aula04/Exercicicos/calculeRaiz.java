package prjAula3;

import java.util.Scanner;

public class calculeRaiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		double a , b , c , d , x1, x2;
		
		System.out.println("Digite o valor de A:");
	    a = in.nextDouble();
		
		System.out.println("Digite o valor de B:");
        b = in.nextDouble();
        
        System.out.println("Digite o valor de C:");
        c = in.nextDouble();
        
        d= (b*b)-4*a*c;
        System.out.println("Apresente o valor de Delta:"+d);
      
        
        if(d<0){
        	System.out.println("Não possui raizes reais");
        }else if(d==0){
            x1 = (-b+Math. sqrt(d))/(2*a);
            System.out.println("Apresente o valor de x1:"+x1);
        }else{
            x1 = (-b+Math. sqrt(d))/(2*a);
            System.out.println("Apresente o valor de x1:"+x1);
            x2 = (-b-Math. sqrt(d))/(2*a);
            System.out.println("Apresente o valor de x2:"+x2);
        }
        	
	}

}
