package Familia51;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
	
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a primeira nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a primeira nota: ");
		nota3 = leia.nextFloat(); 
		
		media = (nota1+nota2+nota3) / 3; 
				
				System.out.println("\nA Média aritmética foi de: "+media);
		
		
	}

}
