package prjEstudos;
import java.util.Scanner;
public class nadador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner in = new Scanner(System.in);
      
	int idade;
	
		System.out.println("Escrava a idade do nadador:");
		idade = in.nextInt();
		

	    if (idade >= 5 && idade <= 8) {
			System.out.println("Infantil");
		}else if(idade >= 9 && idade <= 13){
			System.out.println("JUVENIL A");
		}else if (idade >=14 && idade <=17) {
		    System.out.println("JUVENIL B");
		}else if(idade>=18){
			System.out.println("Adulto");
		}else{
			System.out.println("não tem categoria");
		}

        	
	}

}
