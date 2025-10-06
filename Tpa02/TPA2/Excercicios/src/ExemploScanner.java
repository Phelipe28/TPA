import java.util.Scanner;
public class ExemploScanner {

public static void main(String[] args) {
	
	//Scanner:Estrutura pronta do java que permite digitarmos valores
	Scanner ler = new Scanner(System.in);
	
	//ler.nextInt();variáves do tipo inteira
	//ler.nextDouble();variáveis do tipo reais
	//ler.next();- variáveis do tipo caractere
	
  //Declaração das variáveis
   int base, altura, area;
   
 //Exibição dos valores
   System.out.println ("Digite o primeiro número: ");
   base= ler.nextInt();
   System.out.println ("Digite o segundo número: ");
   altura = ler.nextInt();
   
   //Processamento
   area = (base*altura) /2;
   System.out.println ("area = " + area);
   
   //Exibição dos valores 
 
   }//fim do método main
}//fim da classe 
