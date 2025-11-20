package prjAula3;

import java.util.Scanner;

public class crescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
        Scanner in = new Scanner(System.in);
		
        int a , b , c; 
    
        
        System.out.println("Escreva o valor do Primeiro numero:");
        a = in.nextInt();
        
        System.out.println("Escreva o valor do Segundo numero:");
        b = in.nextInt();
        
        System.out.println("Escreva o valor do Terceiro numero:");
        c = in.nextInt();
        
        if(a<b && b<c){
        	System.out.println("A ordem é: "+a+ ", " +b +" ,"+c);
        }else if(a<c && c<b) {
        	System.out.println("A ordem é:"+a+", "+c+", "+b);
        }else if(b<a && a<c) {
        	System.out.println("A ordem é: "+b+", " +a+", " +c);
        }else if(b<c && c<a) {
        	System.out.println("A ordem é: "+b+", " +c+", " +a);
        }else if(c<b && b<a) {
        	System.out.println("A ordem é: "+c+", " +b+", "+a);
        }else {
        	System.out.println("A ordem é: "+c+", " +a+", " +b);
        }
        
     
        
	}

}
