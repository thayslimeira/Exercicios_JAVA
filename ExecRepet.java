package Familia51;

import java.util.Scanner;

/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR*/

public class ExecRepet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int num,x, contPar = 0, contImpar = 0;
		System.out.println("\nMe mostre 10 algar�tmos: ");
		
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
				System.out.println("Voc� inseriu "+contPar+" numero pares e "+contImpar+"numeros impares");
		
	}

	private static Object x(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
