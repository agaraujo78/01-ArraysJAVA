//04) Dado um vetor V = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, criar um 
//programa que imprima este conjunto acompanhado do seu elemento 
//simétrico em relação a sua posição no conjunto, ou seja, a 
//impressão será: 1 - 10, 2 - 9, 3 - 8, 4 - 7, 5 - 6, 6 - 5, 7 - 4,
// 8 - 3, 9 - 2, 10 - 1.

public class arrayLista04 {

	public static void main(String[] args) {

		int V[] = new int [10];
		
			V[0] = 1;
			V[1] = 2;
			V[2] = 3;
			V[3] = 4;
			V[4] = 5;
			V[5] = 6;
			V[6] = 7;
			V[7] = 8;
			V[8] = 9;
			V[9] = 10;
			

		//Preenchendo o vetor V
		for (int i = 0;  i < 1 ; i++) {
				System.out.printf(" Vetor V = { %s - %s,", V[i] , V[9-i]);
				}		
			
		for (int i = 1;  i < 9; i++) {
			System.out.printf(" %s - %s,", V[i] , V[9-i]);
			}
		for (int i = 9;  i < 10; i++) {
			System.out.printf(" %s - %s }", V[i] , V[9-i]);
			}
		}
	}

