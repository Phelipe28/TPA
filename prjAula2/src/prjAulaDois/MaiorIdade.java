package prjAulaDois;
import java.util.*;
public class MaiorIdade {
             public static void main(String[] args) {
				Scanner in = new Scanner (System.in);
				int anoAtual , nascimento , idade;
				
				System.out.println("Digite o ano atual");
				anoAtual = in.nextInt();
				 
				System.out.println("Digite a data de nascimento");
				nascimento = in.nextInt();
				
				idade = anoAtual-nascimento;
				System.out.println("apresente a idade=" +idade);
				
				if(idade>18) {
					System.out.println("maior de idade");
				}else {
					System.out.println("menor de idade");
				}
				
				
				 
				
			}
}
