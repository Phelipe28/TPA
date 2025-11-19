package prjAulaLacoPara;
import java.util.Scanner;
public class dadosPessoa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int qp2=0,qp=0,i,s1=0 ,id,idVelha=0,idNova=110;
		double a,sa=0,m ,p,porcentagem;
		
		for(i=1; i<=2; i++) {
			
			System.out.println("Digite o peso da "+i+"° Pessoa:");
			p = in.nextDouble();
			System.out.println("Digite a altura da "+i+"° pessoa:");
			a = in.nextDouble();
			System.out.println("Digite a idade da "+i+"° pessoa:");
			id = in.nextInt();
			if(id>50) {
				s1 = s1 + 1;
			  }else if (id>=10 && id<=20){
				  sa = sa + a ;
				  qp = qp +1;
				  
			  }if(p<40){
				 qp2=qp2+1;	 
	
			  }if (id>idVelha) {
				  idVelha=id;
		 
			  }if(id<idNova) {
				  idNova=id;
			}
		   
		   } 
			m = sa / qp;
			porcentagem = (qp2*100)/25;
			System.out.println("Apresente a quantidades das pessoas com idade superior a 50: "+s1);
			
			System.out.println("Apresente a media da altura das pessoas entre 10 e 20 anos: "+m);
			
			System.out.println("Apresente a porcentagem das pessoas com peso inferior a 40 kilos: "+porcentagem+ "%");
			
			System.out.println("A idade da pessoa mais velha: "+idVelha);
			    
			System.out.println("A idade da pessoa mais Nova: "+idNova);
			
			
		
			in.close();			
	}	
		
}
