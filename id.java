package Familia51;

import java.util.Scanner;

public class id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInsira a idade do alune: ");
		idade = leia.nextInt();
		
	if (idade>=10 && idade<=14) {
		System.out.println("\n� categoria Infantil: ");
	}
	
	else if (idade>=15 && idade<=17) {
		System.out.println("\n� categoria Juvenil: ");
		
	}
	else if (idade>=18 && idade<=25) {
			System.out.println("\n� categoria Adulto: ");
			
			
		}
	else { 
		System.out.println("Categoria n�o encontrada");
	}
	}

}
		
