package prjAulaLacoFacaEnq;
import java.util.Scanner;
public class FaixaEtaria {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int id;	
		int f1=0,f2=0,f3=0,f4=0,f5=0;
		int opcao,t;
		double p1, p2,p3,p4,p5;
		
		
		do {	
			System.out.println("Digite a idade da pessoa: ");
			id = in.nextInt();
			if(id<=15) {
				f1 = f1+1;
				System.out.println("Voc� est� na 1� faixa etaria");
			}else if(id<=30) {
				f2 =  f2+1;
				System.out.println("Voc� est� na 2� faixa etaria");
			}else if (id<=45) {
				f3 =  f3+1;
				System.out.println("Voc� est� na 3� faixa etaria");
			}else if (id<=60) {
				f4 =  f4+1;
				System.out.println("Voc� est� na 4� faixa etaria");
			}else {
				f5 =  f5+1;
				System.out.println("Voc� est� na 5� faixa etaria");
			} 
			
			
			
			System.out.println("Deseja continuar 1-Sim ou 2-N�o");
			opcao = in.nextInt();
			
		}while(opcao==1);
			
		
		t = f1+f2+f3+f4+f5;
		p1 = (f1*100)/t;
		p2 = (f2*100)/t;
		p3 = (f3*100)/t;
		p4 = (f4*100)/t;
		p5 = (f5*100)/t;
		
		
		System.out.println("1� faixa: "+f1+" pessoas = "+p1+"%");
		
		System.out.println("2� faixa: "+f2+" pessoas = "+p2+"%");
		
		System.out.println("3� faixa: "+f3+" pessoas = "+p3+"%");
		
		System.out.println("4� faixa: "+f4+" pessoas = "+p4+"%");
		
		System.out.println("5� faixa: "+f5+" pessoas = "+p5+"%");
		

		
	}

}
