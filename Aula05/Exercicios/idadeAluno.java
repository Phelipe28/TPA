package prjIdade;
import java.util.Scanner;
public class IdadeAluno {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int id1,id2,id3,id4,id5,maior,menor,pm,pme;
		
		System.out.println("Digite a idade do 1 aluno:");
		id1 = in.nextInt();
		
		System.out.println("Digite a idade do 2 aluno:");
		id2 = in.nextInt();
		
		System.out.println("Digite a idade do 3 aluno:");
		id3 = in.nextInt();
		
		System.out.println("Digite a idade do 4 aluno:");
		id4 = in.nextInt();
		
		System.out.println("Digite a idade do 5 aluno:");
		id5 = in.nextInt();
	
       maior = 0;
       menor = 0;
       
       if(id1>=18){
    	   maior = maior+1;
       }else {
    	   menor = menor+1;
       }if(id2>=18) {
    	   maior = maior+1;
       }else {
    	   menor = menor+1;
       }if(id3>=18) {
    	   maior = maior+1;
       }else {
    	   menor = menor+1;
       }if(id4>=18) {
    	   maior = maior+1;
       }else {
    	   menor = menor+1;
       }if(id5>=18){
    	   maior = maior+1;
       }else {
    	   menor = menor+1;
       }
       System.out.println("maiores idades:"+maior);
       System.out.println("menores idades:"+menor);
       pm = maior*100/5;
       pme = menor*100/5;
       System.out.println("porcentagem dos maiores de idade:"+pm);
       System.out.println("porcentagem dos menores de idade:"+pme);
	}

}
