package prjAula3;
import java.util.*;
public class calculePeso {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double p, h , imc;
		
		System.out.println("Digite o peso:");
		p = in.nextDouble();
        
		System.out.println("Digite a altura:");
		h = in.nextDouble();
		
		imc = p/(h*h);
		System.out.println("Apresente o imc:"+imc);
		
		if(imc<18.5){
			System.out.println("Excesso de magreza");
		}else if(imc<=25) {
			System.out.println("Peso normal");
		}else if(imc<=30) {
			System.out.println("Excesso de peso");
		}else if(imc<=35) {
			System.out.println("Obesidade(Grau 1)");
		}else if(imc<=40){
			System.out.println("Obesidade(Grau 2)");
		}else {
			System.out.println("Obesidade(Grau 3)");
		}
		
		
	}
}
