package Familia51;

import java.util.Scanner;

public class OrdemdosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/
		
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro n�mero: ");
		a = leia.nextInt();
		System.out.println("\nInsira o segundo n�mero: ");
		b = leia.nextInt();
		System.out.println("\nInsira o terceiro n�mero: ");
		c = leia.nextInt();
		
		if (a<=b && b<=c) 
		{
			System.out.println("\nOrdem crescente:"+a+","+b+","+c);
			
		}
		else if (a<=c && c<=b)
		{
			System.out.println("\nOrdem decrscente:"+a+","+c+","+b);
			
			
		}
		else if (b<=a && a<=c)
		{
			System.out.println("\nSem ordem definida:"+b+","+a+","+c);
			
		}
		else if(b<=c && c<=a) 
			
		{
			System.out.println("\nSem ordem definida:"+b+","+c+","+a);
			
			}
		else if (c<=a && a<=b)
		{ 
			System.out.println("\nSem ordem definida:"+c+","+a+","+b);
			
		}
		else
		{
			System.out.println("\nSem ordem definida:"+c+","+b+","+a);
			
		}
		
	}

}
