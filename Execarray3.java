package Familia51;

import java.util.Scanner;

public class Execarray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		int matriz [] [] = new int [3][3];
		int i,j,maior = 0;
		
		 for (i=0;i<3;i++) {
			 for(j=0;j<3;j++) {
				 System.out.println("Insira o valor de ("+i+","+j+") da Matriz: ");
				 matriz [i][j] = ler.nextInt();
				 if(matriz[i][j]>10) {
					 maior++;
				 }
			 }
		 }
		 System.out.println("\nA matriz contém "+maior+" valores maiores que 10");
	}

}
