package Familia51;

import java.util.Scanner;

public class ProgSequencial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos 
		 e mostre-o expresso em horas, minutos e segundos.*/
		
		float h,m,s,seg = 0,resto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva o tempo de duração do sistema em segundos: ");
		seg = leia.nextFloat();
		
		h = seg / 3600;
		resto = seg % 3600;
		m = resto / 60;
		s = resto % 60;
		
		
		System.out.println("\nO sistema demora  "+h+" horas, " +m+" minutos, "+s+" segundos.");
				
		
		
				

	}

}
