package Familia51;

import java.util.Scanner;

public class ProgSequeencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/
			
		float a,m,d,dias,total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme o dia que voc� nasceu: ");
		d = leia.nextFloat();
		System.out.println("\nInforme o mes que voc� nasceu: ");
		m = leia.nextFloat();
		System.out.println("\nInforme o ano que voc� nasceu: ");
		a = leia.nextFloat();
		

		
		total = (2022 - a)*365 + (m*30);
		dias = total + d;
		
			System.out.printf("\nN�mero de dias vividos: "+dias);
		
		
			
		}
		
	}
