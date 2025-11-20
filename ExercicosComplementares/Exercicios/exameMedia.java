package prjEstudos;
import java.util.Scanner;
public class exameMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	Scanner in = new Scanner(System.in);	
	
	double n1 , n2 ,m , nm, e ;
		
	System.out.println("Escreva a primeira nota:");
	n1 = in.nextDouble();
	System.out.println("Escreva a segunda nota:");
	n2 = in.nextDouble();
	
	m = (n1+n2)/2;
	
	System.out.println("A média é:"+m);
	
	if(m>=6) {
		System.out.println("Aprovado");
	}else if(m>=3 && m<6) {
		System.out.println("Está em exame");
		System.out.println("A nota do exame é:");
		e = in.nextDouble();
		nm = (m+e)/2;
		System.out.println("Nova média:"+nm);
		if(nm>=6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	  }else {
		  System.out.println("Reprovado");
	  }
	}

}
