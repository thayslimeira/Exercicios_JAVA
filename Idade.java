package Familia51;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/
		
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInsira a didade do alune: ");
		idade = leia.nextInt();
		
	if (idade>=10 && idade<=14) {
		System.out.println("\nÉ categoria Infantil!!! ");
	}
	
	else if (idade>=15 && idade<=17) {
		System.out.println("\nÉ categoria Juvenil!!! ");
		
	}
	else if (idade>=18 && idade<=25) {
			System.out.println("\nÉ categoria Adulto!!! ");
			
			
		}
	else { 
		System.out.println("Categoria não encontrada");
	}
	}

}
