package prjAula4;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int anoAtual,dataNasc,idade,opcao;
		do {
			System.out.println("Digite o ano atual");
			anoAtual = in.nextInt();
			System.out.println("Digite a data de nascimento");
			dataNasc = in.nextInt();
			
			idade = anoAtual - dataNasc;
			System.out.println(idade);
			
			
			System.out.println("Continuar ? 1-sim 0-sair") ;
			opcao=in.nextInt();
			
		}while(opcao==1);
		in.close();
	}

}
