package prjAula4;

import java.util.Scanner;

public class DiaSeguinte {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int dia , mes , ano;
		
		
		System.out.println("Digite o dia em numero:");
		dia = in.nextInt();
		
		System.out.println("Digite o mes em numero:");
		mes = in.nextInt();
		
		System.out.println("Digite o ano em numero:");
		ano = in.nextInt();
		
		if(mes==12 && dia==31) {
			ano = ano +1;
			mes= 1;
			dia = 1;
		}else {
			if(mes==2) {
				if((ano%4==0||ano % 100 != 0)||ano%400==0) {
						if(dia<29) {
							dia = dia+1;
						}else {
							mes = mes+1;
							dia = 1;
						}
					
				}else {
					if(dia<28) {
						dia = dia +1;
					}else {
						mes = mes+1;
						dia = 1;
						}
					}
			}else if(mes==4||mes==6||mes==9||mes==11) {
					if(dia<30) {
						dia = dia+1;
					}else {
						mes = mes+1;
						dia = 1;	
					}
			}else {
				if(dia<31) {
					dia = dia+1;	
				}else {
					mes = mes+1;
					dia = 1;
				}
				
			}
		}
		System.out.println(+dia+"/"+mes+"/"+ano);
		in.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		/*
			if(mes == 12 && dia==31) {
				dia = 1;
				mes = 1;
				ano = ano+1;
			}
			if(ano%4==0 && mes == 2 && dia==29) {
				dia = 1;
				mes = mes+1;o ano esta errado porque o dia esta como se fosse ano bissexto
			}else{
				dia=1;
				mes= mes +1;
			}


		    if(dia==30||dia==31) {
					dia = 1;
					mes = mes+1;
			}
			
			
			System.out.println(dia+"/"+mes+"/"+ano);
			*/}
			
	}


