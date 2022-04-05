package Familia51;

import java.util.Scanner;

/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR*/

public class ExecRepet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int num,x, contPar = 0, contImpar = 0;
		System.out.println("\nMe mostre 10 algarítmos: ");
		
		for (x=1; x<=10; x++)
		{
			num = ler.nextInt();
					if(num %2 ==0) {
						contPar++;
					}
					else {
						contImpar++;
						
					}
		}
				System.out.println("Você inseriu "+contPar+" numero pares e "+contImpar+"numeros impares");
		
	}

	private static Object x(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
