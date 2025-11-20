package prjAula3;
import java.util.Scanner;
public class desconto {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double s , irpf ;
		
		System.out.println("digite o salario:");
		s = in.nextDouble();
		
	
		
		if(s<=1434.00) {
			irpf = s*0/100-0;
			System.out.println("o desconto do irpf é: "+irpf);
		}else if(s<=2150.00) {
			irpf = s*7.5/100-107.59;
			System.out.println("o desconto do irpf é:"+irpf);
		}else if(s<=2866.00){
			irpf = s*15/100-268.84;
			System.out.println("o desconto do irpf é:"+irpf);
		}else if(s<=3582.00){
			irpf = s*22.5/100-483.84;
			System.out.println("o desconto do irpf é:"+irpf);
		}else{
			irpf = s*27.5/100-662.94;
			System.out.println("o desconto de irpf é:"+irpf);
		}
	  
	}	
}
