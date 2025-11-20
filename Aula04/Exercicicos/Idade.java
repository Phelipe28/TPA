package prjAula3;

import java.util.*;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        
		int idade , nasc, atual;
		
		System.out.println("Escreva seu ano de nascimento");
		nasc = in.nextInt();
		System.out.println("Escreva o ano atual");
		atual = in.nextInt();
		idade = atual - nasc;
		System.out.println("Apresente a idade:" +idade);
		
		if(idade<10) {
		     System.out.println("Criança");
		}else if(idade<18) {
			System.out.println("Adolescente");
		}
		else if (idade<60) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
	
        		
	}

}
