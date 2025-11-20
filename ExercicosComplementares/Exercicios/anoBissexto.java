package prjEstudos;
import java.util.Scanner;
public class anoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner (System.in);
    
    int a;
		
    System.out.println("Escreva o ano");
	a = in.nextInt();
	
	if(a%4==0) {
		System.out.println("Ano bissexto");
	   }else {
		   System.out.println("Não é um ano bissexto");
	   }
		  
	}

}
