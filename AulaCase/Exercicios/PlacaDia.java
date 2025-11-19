package prjAula3Case;
import java.util.Scanner;
public final class PlacaDia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println("Digite o ultimo numero da sua placa:");
		n = in.nextInt();
		
		switch (n){
			case 1:
			case 2:
				System.out.println("Não pode Segunda");
				break;
			case 3:
			case 4:
				System.out.println("Não pode Terça");
				break;
			case 5: 
			case 6:
				System.out.println("Não pode Quarta");
				break;
			case 7:
			case 8:
				System.out.println(" Não pode Quinta");
				break;
			case 9:
			case 0:
				System.out.println("Não pode Sexta");	
				break;
			default:
				System.out.println("Dia Invalido");
              		
		}

	}

}
