package prjAula3;
import java.util.Scanner;
public class nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner in = new Scanner(System.in);
		
		int n1, n2, m , r1 , nm;
		
        System.out.println("Digite a primeira nota:");
		n1 = in.nextInt();
		
	    System.out.println("Digite a segunda nota");
		n2 = in.nextInt();
		 
		m = (n1+n2)/2;
		System.out.println("Apresente a média:"+m);
		
		if(m<3) {
			System.out.println("Reprovado");
		}else if(m>=3 && m<6) {
			System.out.println("realizar a recuperação");
			System.out.println("Digite a nota da recuperação:");
			r1 = in.nextInt();
			nm =(m+r1)/2;
			System.out.println("nova média:"+nm);
			if(nm>=6) {
				System.out.println("Aprovado");				
			}else {
				System.out.println("Reprovado");
			}
		}else {
			System.out.println("Aprovado");
		}
	}

}
