package Familia51;

import java.util.Scanner;

public class ExecRepet3 {
	/*3-	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
	 O programa termina quando idade for =-99. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0, y = 0, idade = 0, jovem = 0, idoso = 0;
		Scanner ler = new Scanner(System.in);
		
		while(idade!= -99)
		{
			System.out.println("Diga a sua idade: ");
			idade = ler.nextInt();
			if (idade<21)
			{
			x++; // x = x + 1
			
			if (idade>50)
			{
				
				y++; 
				
			}
			
				
			}
			
		}
		
		System.out.println("\nExistem "+x+" pessoas menores que 21 e existem "+y+" pessoas com mais de 50 anos");
	}

}
