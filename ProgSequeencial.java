package Familia51;

import java.util.Scanner;

public class ProgSequeencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/
			
		float a,m,d,dias,total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme o dia que você nasceu: ");
		d = leia.nextFloat();
		System.out.println("\nInforme o mes que você nasceu: ");
		m = leia.nextFloat();
		System.out.println("\nInforme o ano que você nasceu: ");
		a = leia.nextFloat();
		

		
		total = (2022 - a)*365 + (m*30);
		dias = total + d;
		
			System.out.printf("\nNúmero de dias vividos: "+dias);
		
		
			
		}
		
	}
