package prjEstudos;
import java.util.Scanner;
public class ordemCrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);	
		
	int n1, n2 ,n3;
	
		System.out.println("Escreva um numero:");
		n1 = in.nextInt();
		System.out.println(" Escreva outro:");
		n2 = in.nextInt();
		System.out.println("Escreva mais um:");
		n3 = in.nextInt();
		
		
		if(n1<n2 && n2<n3) {
			System.out.println("A ordem é:"+n1+" "+n2+" "+n3);
		}else if(n1<n3 && n3<n2) {
			System.out.println("A ordem é:"+n1+" "+n3+" "+n2);
		}else if(n2<n3 && n3<n1) {
			System.out.println("A ordem é:"+n2+" "+n3+" "+n1);
		}else if(n2<n1 && n1<n3) {
			System.out.println("A ordem é:"+n2+" "+n1+" "+n3);
		}else if(n3<n2 && n2<n1) {
			System.out.println("A ordem é:"+n3+" "+n2+" "+n1);
		}else {
			System.out.println("A ordem é:"+n3+" "+n1+" "+n2);
		}
	}

}
