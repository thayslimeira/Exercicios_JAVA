package Familia51;

import java.util.Scanner;

public class ExecRepet5 {
	/*5-	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
	 No final, mostre a soma dos n�meros digitados.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0, soma=0;
		
		Scanner ler = new Scanner(System.in);

			do
			{
				System.out.println("\nDiga um n�mero: ");
				x = ler.nextInt();
				
				soma += x;  // soma = soma + x
				
				}
			while (x != 0); 
			
			System.out.println("\nResultado da soma: " +soma);
			
			
	}

}
