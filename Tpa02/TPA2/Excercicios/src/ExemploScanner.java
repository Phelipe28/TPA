import java.util.Scanner;
public class ExemploScanner {

public static void main(String[] args) {
	
	//Scanner:Estrutura pronta do java que permite digitarmos valores
	Scanner ler = new Scanner(System.in);
	
	//ler.nextInt();vari�ves do tipo inteira
	//ler.nextDouble();vari�veis do tipo reais
	//ler.next();- vari�veis do tipo caractere
	
  //Declara��o das vari�veis
   int base, altura, area;
   
 //Exibi��o dos valores
   System.out.println ("Digite o primeiro n�mero: ");
   base= ler.nextInt();
   System.out.println ("Digite o segundo n�mero: ");
   altura = ler.nextInt();
   
   //Processamento
   area = (base*altura) /2;
   System.out.println ("area = " + area);
   
   //Exibi��o dos valores 
 
   }//fim do m�todo main
}//fim da classe 
