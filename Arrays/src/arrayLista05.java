//05)	Dado um vetor V = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 
//13, 26, 49, 50}, criar um programa a que receba um número pelo 
//teclado, verifique e imprima na tela se este número existe no vetor.

import java.util.Scanner;
public class arrayLista05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int V[] = new int [14];
		int n;
		int cont = 0;
		
			V[0] = 91;
			V[1] = 10;
			V[2] = 50;
			V[3] = 89;
			V[4] = 45;
			V[5] = 80;
			V[6] = 2;
			V[7] = 45;
			V[8] = 3;
			V[9] = 105;
			V[10] = 95;
			V[11] = 13;
			V[12] = 26;
			V[13] = 49;
			
			System.out.print("Digite um número: ");
			   n = leitor.nextInt();
			   
			   for(int i = 0; i < 14; i++) {
			      if (V[i] == n ) {
			    	  System.out.printf("O número ‘%d’  existe no vetor.", n);break; 
			      } else {
			    	  cont = cont + 1;
			      }
			      
			   if ( cont == 14) {
				   System.out.printf("O número ‘%d’ não existe no vetor.", n);
			   }
			   } 
	}

}
